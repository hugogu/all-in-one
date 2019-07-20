package hugo.io.spring.postgres.domain

import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import org.hibernate.annotations.TypeDef
import org.hibernate.annotations.TypeDefs
import org.springframework.data.domain.Persistable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
@TypeDefs(TypeDef(name = "jsonb", typeClass = JsonBinaryType::class))
abstract class AbstractEntity : Persistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    override fun getId(): Long? {
        return id
    }

    override fun isNew(): Boolean {
        return id == null
    }
}