package Dasar

fun String.ucapan(): String {
    return "Selamat $this"
}

fun main() {
    val waktu = "Pagi"
    println(waktu.ucapan())
}