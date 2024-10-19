package lesson005.DZ5_0

// Є список чисел: [3, 6, 9, 12, 15]. Використовуючи функцію filter, залиште тільки числа, що діляться на 3.

fun main() {
    val numbers = listOf(3, 6, 9, 12, 15)
    val filteredNumbers = numbers.filter { it % 3 == 0 }
    filteredNumbers.forEach { println(it) }
}