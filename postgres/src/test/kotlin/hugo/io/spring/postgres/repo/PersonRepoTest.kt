package hugo.io.spring.postgres.repo

import hugo.io.spring.postgres.domain.Address
import hugo.io.spring.postgres.domain.Person
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class PersonRepoTest {
    @Autowired
    lateinit var personRepo: PersonRepo

    @Test
    fun findByCountryTest() {
        personRepo.save(Person("number").apply { address = Address(country = "China") })
        var person = personRepo.findByCountry("China", PageRequest.of(0, 10))
        assertNotNull(person)

        person = personRepo.findByCountry("China")
        assertNotNull(person)

        person = personRepo.findByCountry()
        assertNotNull(person)
    }
}