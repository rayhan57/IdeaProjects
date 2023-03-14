package app

import data.Daerah
import data.Kota

fun main() {
    val city = Kota("Bekasi")
    city.residence()

    val area = Daerah("Jatiwaringin")
    area.residence()
}