package lesson004.DZ4_0

fun averageOfList(numbers: List<Int>): Double {
    return if (numbers.isNotEmpty()) {
        numbers.average()
    } else {
        throw IllegalArgumentException("List is empty")
    }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = averageOfList(numbers)
    println(result)
}