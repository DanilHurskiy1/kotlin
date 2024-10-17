package lesson005.DZ5_0

// Є список чисел: [5, 3, 8, 1, 9, 2]. Знайдіть максимальне та мінімальне значення у цьому списку.

fun main() {
    val numbers = listOf(5, 3, 8, 1, 9, 2)
    val maxNumber = numbers.maxOrNull()
    val minNumber = numbers.minOrNull()

    println("Maximum value: $maxNumber")
    println("Minimum value: $minNumber")
}