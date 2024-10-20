package lesson005.DZ5_0

// Є список рядків: ["123", "456", "789"]. Перетворіть його в список цілих чисел: [123, 456, 789].

fun main() {
    val list = listOf("123", "456", "789")
    val listInt = list.map { it.toInt() }
    println(listInt)
}