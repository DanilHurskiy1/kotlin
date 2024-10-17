package lesson005.DZ5_0

// Є список імен: ["Андрій", "Богдан", "Віктор", "Галина", "Дарина"]. Відсортуйте цей список в алфавітному порядку та виведіть результат.

fun main() {
    val names = listOf("Віктор", "Богдан", "Галина", "Андрій", "Дарина")
    val sortedNames = names.sorted()
    sortedNames.forEach { println(it) }
}