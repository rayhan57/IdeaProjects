package app

import data.Customer
import data.VIPCustomer

fun main() {
    val customer = Customer("Rayhan", "Pria")
    println("Nama ${customer.name} jenis kelamin ${customer.gender}")

    val VIP = VIPCustomer("Aho", "Aktif")
    println("Nama ${VIP.name} status ${VIP.status}")
}