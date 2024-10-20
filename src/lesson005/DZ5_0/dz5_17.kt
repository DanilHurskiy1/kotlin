package lesson005.DZ5_0

// Створіть список випадкових чисел. Відсортуйте його в порядку зростання та виведіть результат.

fun main() {
    val numbers = listOf(5, 3, 1, 2, 4)
    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)
}