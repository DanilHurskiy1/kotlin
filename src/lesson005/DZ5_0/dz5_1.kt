package lesson005.DZ5_0

// Створіть список цілих чисел від 1 до 100. Виведіть на екран всі парні числа з цього списку.

fun main() {
    val numbers = (1..100).toList()
    val evenNumbers = numbers.filter { it % 2 == 0 }
    evenNumbers.forEach { println(it) }
}