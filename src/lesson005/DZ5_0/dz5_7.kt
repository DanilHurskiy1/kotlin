package lesson005.DZ5_0

// Створіть масив чисел від 1 до 20. Виведіть суму всіх чисел у масиві.

fun main() {
    val numbers = (1..20).toList()
    val sum = numbers.sum()
    println("The sum of numbers from 1 to 20 is $sum")
}