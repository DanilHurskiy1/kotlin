package lesson003.DZ3_0

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    var evenCount = 0

    for (number in numbers) {
        if (number % 2 == 0) {
            evenCount++
        }
    }

    println("Кількість парних чисел у списку: $evenCount")
}