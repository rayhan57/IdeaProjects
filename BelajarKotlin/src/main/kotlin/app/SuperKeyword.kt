package app

import data.Circle
import data.RoundRect
import data.Shape

fun main() {
    val shape1 = Shape()
    println("Shape: ${shape1.radius}px")

    val shape2 = RoundRect()
    println("Round Rectangle: ${shape2.radius}px and Parrent Radius: ${shape2.parrentRadius}px")

    val shape3 = Circle()
    println("Circle: ${shape3.radius}px")
}