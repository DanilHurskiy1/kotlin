package lesson005.DZ5_0

// Є Map, де ключами є назви продуктів, а значеннями — їхні ціни. Обчисліть загальну вартість всіх продуктів.

fun main() {
    val products = mapOf(
        "Молоко" to 20.0,
        "Хліб" to 10.0,
        "Яйця" to 30.0
    )
    val totalPrice = products.values.sum()
    println(totalPrice)
}