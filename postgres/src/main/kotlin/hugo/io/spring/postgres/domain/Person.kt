package hugo.io.spring.postgres.domain

import javax.persistence.Entity

@Entity
data class Person(val idNumber: String) : AbstractEntity() {
    var name: String = ""
}