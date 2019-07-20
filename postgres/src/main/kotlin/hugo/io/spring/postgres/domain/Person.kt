package hugo.io.spring.postgres.domain

import org.hibernate.annotations.Type
import javax.persistence.Column
import javax.persistence.Entity

@Entity
data class Person(val idNumber: String) : AbstractEntity() {
    var name: String = ""

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    var address: Address? = null

    constructor() : this("")
}