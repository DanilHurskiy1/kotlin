package lesson004.DZ4_0

fun stringToCharList(input: String): List<Char> {
    return input.toList()
}

fun main() {
    val input = "Hello, World!"
    val result = stringToCharList(input)
    println(result)
}