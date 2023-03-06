fun main() {
    fun hello(nama: String, transform: (String) -> String): String {
        val transformNama = transform(nama)
        return "Hello $transformNama"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return ""
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Rayhan", upper))
}