package lesson004.DZ4_0

fun <T> reverseList(input: List<T>): List<T> {
    return input.reversed()
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val reversedList = reverseList(list)
    println(reversedList)
}