package lesson004.DZ4_0

fun sumOfList(numbers: List<Int>): Int {
    return numbers.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = sumOfList(numbers)
    println(result)
}