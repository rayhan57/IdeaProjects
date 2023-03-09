package data

open class Laptop(val merk: String) {
    fun spek(processor: String, ram: Int) {
        println("Saya punya laptop merk $merk dengan processor $processor dan ram $ram GB")
    }
}

class LaptopUser(merk: String) : Laptop(merk)
class LaptopAdmin(merk: String) : Laptop(merk)
