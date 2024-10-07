package lesson003.DZ3_0

fun main() {
    val numbers = listOf(3, 5, 7, 2, 8, 1, 4, 10, 6)
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    println("Максимальний елемент у списку чисел: $max")
}