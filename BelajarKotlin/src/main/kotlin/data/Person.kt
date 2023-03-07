package data

class Person {
    var namaDepan = ""
    var namaTengah = ""
    var namaBelakang = ""

    fun hei(name: String): String {
        return "Hei $name, nama saya $namaDepan dan nama panjang saya ${namaPanjang()}"
    }

    fun namaPanjang(): String {
        return "$namaDepan $namaTengah $namaBelakang"
    }
}