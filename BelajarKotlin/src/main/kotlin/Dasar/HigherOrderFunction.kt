package Dasar

fun main() {
    fun hello(nama: String, transform: (String) -> String): String {
        val transformNama = transform(nama)
        return "Hello $transformNama"
    }

    val result = hello("rayhan") { value: String -> value.substring(0, 1).toUpperCase() + value.substring(1) }
    println(result)
}