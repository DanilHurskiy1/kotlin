package lesson004.DZ4_0

fun countCharacterOccurrences(input: String, char: Char): Int {
    return input.count { it == char }
}

fun main() {
    val input = "Hello, World!"
    val char = 'o'
    val result = countCharacterOccurrences(input, char)
    println("The character '$char' appears $result times in the string \"$input\"")
}