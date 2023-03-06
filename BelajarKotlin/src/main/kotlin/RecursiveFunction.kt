fun main() {
    fun factorialRecursive(value: Int): Int {
        return if (value == 1) {
            1
        } else {
            value * factorialRecursive(value - 1)
        }
    }
    println(factorialRecursive(10))
}