package app

import data.User

fun main() {
    val admin = User("rayhan57", "1234")
    println("Username Anda: ${admin.username}\npassword Anda: ${admin.password}")
}