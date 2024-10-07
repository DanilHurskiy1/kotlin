package lesson003.DZ3_0

fun main() {
    val numbers = listOf(10, 20, 30, 40, 55, 60, 70)

    for (number in numbers) {
        if (number > 50) {
            println("Перше число більше 50: $number")
            break
        }
    }
}