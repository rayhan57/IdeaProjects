package app

import data.Street

fun main() {
    val alamat = Street("Rawa Indah", "Jaticempaka")
    println("Saya tinggal di Jalan ${alamat.jalan} Kelurahan ${alamat.kelurahan}")

    val alamat2 = Street("Rawa Indah")
    println("Saya tinggal di Jalan ${alamat2.jalan}")
}