package data

abstract class Address(val name: String) {
    fun residence() {
        println("Saya tinggal di ${javaClass.simpleName} $name")
    }
}

class Kota(name: String) : Address(name)
class Daerah(name: String) : Address(name)