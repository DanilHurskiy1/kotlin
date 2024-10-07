package lesson002.DZ2_0

fun main() {
    val dayNumber: Int = 3

    val dayOfWeek = when (dayNumber) {
        1 -> "Понеділок"
        2 -> "Вівторок"
        3 -> "Середа"
        4 -> "Четвер"
        5 -> "П'ятниця"
        6 -> "Субота"
        7 -> "Неділя"
        else -> "Невірний номер дня"
    }

    println(dayOfWeek)
}