package hugo.io.spring.postgres.domain


data class Address(
        val country: String = "",
        val city: String = "",
        val postCode: String = "",
        val detail: String = "")
