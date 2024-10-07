package lesson003.DZ3_0

fun main() {
    val numbers = listOf(3, 15, 7, 12, 8, 20, 4, 10, 6)
    var count = 0
    for (number in numbers) {
        if (number > 10) {
            count++
        }
    }
    println("Кількість елементів у списку, які більші за 10: $count")
}