package lesson005.DZ5_0

// Створіть список чисел. Розділіть його на два списки: один з парними числами, інший з непарними.

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val (evenNumbers, oddNumbers) = numbers.partition { it % 2 == 0 }
    println(evenNumbers)
    println(oddNumbers)
}