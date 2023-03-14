package app

import data.Cat
import data.Cow

fun main() {
    val cow = Cow()
    println("${cow.name} ${cow.ability()}")

    val cat = Cat()
    println("${cat.name} ${cow.ability()}")
}