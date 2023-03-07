package app

import data.Person

fun main() {
    val orang1 = Person()
    orang1.namaDepan = "Rayhan"
    orang1.namaTengah = "Lingga"
    orang1.namaBelakang = "Buana"

    val sapa = orang1.hei("Jack")
    println(sapa)
}