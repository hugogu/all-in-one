package hugo.io.spring.postgres.repo

import hugo.io.spring.postgres.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepo : JpaRepository<Person, Long>
