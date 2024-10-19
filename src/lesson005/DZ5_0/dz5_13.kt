package lesson005.DZ5_0

// Створіть MutableMap, де ключами будуть імена студентів, а значеннями — їхні оцінки. Додайте кілька студентів, змініть оцінку одного з них і виведіть всі записи.

fun main() {
    val students = mutableMapOf(
        "Олександр" to 5,
        "Іван" to 4,
        "Марія" to 3
    )
    students["Іван"] = 5
    students.forEach { (name, grade) -> println("$name: $grade") }
}