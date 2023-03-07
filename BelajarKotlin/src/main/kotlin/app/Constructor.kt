package app

import data.Motorcycle

fun main() {
    val motor1 = Motorcycle("Yamaha", "Nmax")
    println("${motor1.brand} ${motor1.name}")

    val motor2 = Motorcycle("Honda", "PCX")
    println("Saya punya motor ${motor2.brand} ${motor2.name}")
}