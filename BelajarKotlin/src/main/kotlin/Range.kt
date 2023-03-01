fun main() {
//  val angka = 1..100
    val angka = 1 until 100 step 2

    println("Jumlah angka: ${angka.count()}")
    println("Angka peratama: ${angka.first}")
    println("Angka terakhir: ${angka.last}")
    println("Step angka: ${angka.step}")
    angka.forEach { print("$it ") }
}
