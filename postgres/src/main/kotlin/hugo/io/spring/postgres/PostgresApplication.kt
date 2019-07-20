package hugo.io.spring.postgres

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
open class PostgresApplication

fun main(args: Array<String>) {
    SpringApplication.run(PostgresApplication::class.java, *args)
}