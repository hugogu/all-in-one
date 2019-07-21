package hugo.io.spring.postgres.repo

import hugo.io.spring.postgres.domain.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService {
    @Autowired
    lateinit var personRepo: PersonRepo

    fun searchByCountry(country: String): List<Person> {
        return personRepo.findAll { root, query, builder ->
            builder.equal(builder.function("jsonb_extract_path_text", String::class.java, root.get<String>("address"), builder.literal("country")), country)
        }
    }
}