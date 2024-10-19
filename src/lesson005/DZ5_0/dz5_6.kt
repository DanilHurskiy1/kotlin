package lesson005.DZ5_0

// Є список слів: ["кот", "собака", "папуга", "кит", "мураха"]. Відфільтруйте слова, які мають більше 3 літер, і виведіть їх.

fun main() {
    val words = listOf("кот", "собака", "папуга", "кит", "мураха")
    val filteredWords = words.filter { it.length > 3 }
    filteredWords.forEach { println(it) }
}