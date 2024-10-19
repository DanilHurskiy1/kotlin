package lesson005.DZ5_0

// Є список списків: [[1, 2], [3, 4], [5, 6]]. Перетворіть його в один плоский список: [1, 2, 3, 4, 5, 6].

fun main() {
    val numbers = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
    val flatNumbers = numbers.flatten()
    flatNumbers.forEach { println(it) }
}