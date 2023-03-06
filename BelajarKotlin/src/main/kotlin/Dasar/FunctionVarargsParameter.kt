package Dasar

fun hitung(vararg angka: Int): Int {
    var total = 0

    angka.forEach { e -> total += e }
    return total
}

fun main() {
    println(hitung(10, 20, 30))
}