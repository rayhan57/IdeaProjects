package data

open class Shape {
    open val radius = 1
}

class RoundRect : Shape() {
    override val radius = 5
    val parrentRadius = super.radius
}

class Circle : Shape() {
    override val radius = 30
}