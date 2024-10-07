package lesson004.DZ4_0

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

fun main() {
    val year = 2024
    val result = isLeapYear(year)
    println(result)
}