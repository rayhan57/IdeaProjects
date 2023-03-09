package app

import data.LaptopAdmin
import data.LaptopUser

fun main() {
    val device1 = LaptopUser("Lenovo")
    device1.spek("Intel i3", 8)

    val device2 = LaptopAdmin("Asus")
    device2.spek("Ryzen 5", 16)
}