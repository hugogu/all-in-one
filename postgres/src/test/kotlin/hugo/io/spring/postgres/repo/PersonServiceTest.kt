package hugo.io.spring.postgres.repo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class PersonServiceTest {
    @Autowired
    lateinit var personService: PersonService

    @Test
    fun queryByCountryTest() {
        val people = personService.searchByCountry("China")
        Assertions.assertNotNull(people)
    }
}