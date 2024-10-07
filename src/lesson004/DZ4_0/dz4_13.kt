package lesson004.DZ4_0

fun countCharacters(input: String): Int {
    return input.length
}

fun main() {
    val input = "Hello, World!"
    val result = countCharacters(input)
    println(result)  // Output: 13
}