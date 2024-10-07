package lesson003.DZ3_0

fun main() {
    val str = "Це приклад рядка з кількома словами"
    val words = str.split(" ")
    val wordCount = words.size
    println("Кількість слів у рядку: $wordCount")
}