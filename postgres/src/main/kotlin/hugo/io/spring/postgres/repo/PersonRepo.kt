package hugo.io.spring.postgres.repo

import hugo.io.spring.postgres.domain.Person
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PersonRepo : JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {
    @Query("SELECT * FROM Person WHERE (:country = '' OR address->>'country' = :country)", nativeQuery = true)
    fun findByCountry(@Param("country") country:String = "", paging: Pageable? = null): Page<Person>
}
