package app

import data.SUV
import data.Sedan


fun main() {
    val suv = SUV("Pajero", "Diesel")
    suv.buy()

    val sedan = Sedan("Honda", "Civic Turbo", "Bensin")
    sedan.buy()
}