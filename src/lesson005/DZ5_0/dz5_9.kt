package lesson005.DZ5_0

// Створіть список чисел і перевірте, чи містить він число 50.

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 50, 6, 7, 8, 9, 10)
    val contains50 = numbers.contains(50)
    println("The list contains 50: $contains50")
}