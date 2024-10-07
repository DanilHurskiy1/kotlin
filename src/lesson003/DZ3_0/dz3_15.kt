package lesson003.DZ3_0

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val squaredNumbers = numbers.map { it * it }
    println("Список квадратів чисел: $squaredNumbers")
}