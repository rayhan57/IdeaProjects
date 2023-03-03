infix fun String.to(jenis: String): String {
    if (jenis == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    println("rayhan" to "UP" )
}