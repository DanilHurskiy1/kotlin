package lesson004.DZ4_0

fun maxOfList(numbers: List<Int>): Int {
    return numbers.maxOrNull() ?: throw IllegalArgumentException("List is empty")
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = maxOfList(numbers)
    println(result)
}