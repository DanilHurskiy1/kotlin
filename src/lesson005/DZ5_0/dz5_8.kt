package lesson005.DZ5_0

// Є список оцінок студентів: [95, 82, 76, 88, 100, 67, 73]. Обчисліть середню оцінку.

fun main() {
    val grades = listOf(95, 82, 76, 88, 100, 67, 73)
    val averageGrade = grades.average()
    println("The average grade is $averageGrade")
}