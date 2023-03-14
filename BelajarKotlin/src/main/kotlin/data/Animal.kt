package data

abstract class Animal {
    abstract val name: String
    abstract fun ability(): String
}

class Cow : Animal() {
    override val name: String = "Cow"

    override fun ability(): String {
        return "Mowwwwww"
    }
}

class Cat : Animal() {
    override val name: String = "Cat"
    override fun ability(): String {
        return "Miauuuu"
    }
}