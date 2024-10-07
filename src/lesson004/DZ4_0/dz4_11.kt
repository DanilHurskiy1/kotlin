package lesson004.DZ4_0

fun countWords(input: String): Int {
    return input.trim().split("\\s+".toRegex()).size
}

fun main() {
    val input = "Hello, World! This is a test."
    val result = countWords(input)
    println(result)
}