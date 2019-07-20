package hugo.io.spring.postgres.repo

import hugo.io.spring.postgres.domain.Person
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PersonRepo : JpaRepository<Person, Long> {
    @Query(nativeQuery = true, value = "SELECT * from Person where address->>'country' = :country")
    fun findByCountry(country:String, paging: Pageable): Page<Person>
}
