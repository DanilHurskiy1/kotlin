package lesson005.DZ5_0

// Створіть MutableList цілих чисел. Додайте до нього числа від 1 до 10. Видаліть всі непарні числа. Виведіть отриманий список.

fun main() {
    val numbers = mutableListOf<Int>()
    for (i in 1..10) {
        numbers.add(i)
    }
    numbers.removeAll { it % 2 != 0 }
    println(numbers)
}