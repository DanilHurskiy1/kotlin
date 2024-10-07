package lesson004.DZ4_0

fun countVowels(input: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return input.count { it in vowels }
}

fun main() {
    val input = "Hello, World!"
    val result = countVowels(input)
    println(result)
}