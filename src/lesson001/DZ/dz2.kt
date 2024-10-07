package lesson001.DZ

fun filterMasiva(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val Perebrav = filterMasiva(numbers)
    println(Perebrav)
}