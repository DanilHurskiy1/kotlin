package lesson005.DZ5_0

// Створіть список чисел від 1 до 10. Помножте кожне число на 2 і збережіть результати в новий список.

fun main() {
    val numbers = (1..10).toList()
    val doubledNumbers = numbers.map { it * 2 }
    doubledNumbers.forEach { println(it) }
}