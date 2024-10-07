package lesson004.DZ4_0

fun calculateCircleArea(radius: Double): Double {
    return Math.PI * radius * radius
}

fun main() {
    val radius = 5.0
    val area = calculateCircleArea(radius)
    println("The area of the circle with radius $radius is $area")
}