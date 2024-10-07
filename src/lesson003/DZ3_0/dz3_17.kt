package lesson003.DZ3_0

fun main() {
    val numbers = (1..10).toList()

    for (number in numbers) {
        if (number % 3 == 0) {
            continue
        }
        println(number)
    }
}