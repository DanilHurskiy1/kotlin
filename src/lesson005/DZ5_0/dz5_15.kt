package lesson005.DZ5_0

// Створіть набір (Set) чисел від 1 до 5. Спробуйте додати в нього число 3 і поясніть результат.

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5)
    val added = numbers.plus(3)
    println(added)
}