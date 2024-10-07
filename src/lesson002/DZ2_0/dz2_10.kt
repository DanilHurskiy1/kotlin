package lesson002.DZ2_0

fun main() {
    val charValue: Char = 'a'

    val result = when (charValue) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> "Голосна"
        else -> "Приголосна"
    }

    println(result)
}