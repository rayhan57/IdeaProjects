package data

open class Car(val name: String, val fuel: String) {
    open fun buy() {
        println("Saya membeli mobil $name dengan bahan bakar $fuel")
    }
}

class SUV(val brand: String, name: String, fuel: String) : Car(name, fuel) {
    constructor(name: String, fuel: String) : this("", name, fuel)

    override fun buy() {
        when (brand) {
            "" -> println("Saya membeli mobil ${javaClass.simpleName} $name dengan bahan bakar $fuel")
            else -> {
                println("Saya membeli mobil ${javaClass.simpleName} $brand $name dengan bahan bakar $fuel")
            }
        }
    }
}

class Sedan(val brand: String, name: String, fuel: String) : Car(name, fuel) {
    constructor(name: String, fuel: String) : this("", name, fuel)

    override fun buy() {
        when (brand) {
            "" -> println("Saya membeli mobil ${javaClass.simpleName} $name dengan bahan bakar $fuel")
            else -> {
                println("Saya membeli mobil ${javaClass.simpleName} $brand $name dengan bahan bakar $fuel")
            }
        }
    }
}


