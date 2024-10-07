package lesson003.DZ3_0

fun main() {
    val numbers = listOf(3, 5, 7, 12, 8, 20, 4, 10, 6)
    for (number in numbers) {
        if (number == 5) {
            println("Знайдено")
            break
        }
    }
}