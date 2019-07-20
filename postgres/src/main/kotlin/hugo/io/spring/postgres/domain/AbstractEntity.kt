package hugo.io.spring.postgres.domain

import org.springframework.data.domain.Persistable
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class AbstractEntity : Persistable<Long> {
    @Id
    @GeneratedValue
    private var id: Long? = null

    override fun getId(): Long? {
        return id
    }

    override fun isNew(): Boolean {
        return id == null
    }
}