package lesson004.DZ4_0

fun isPalindrome(input: String): Boolean {
    val cleanedInput = input.replace("\\s".toRegex(), "").lowercase()
    return cleanedInput == cleanedInput.reversed()
}

fun main() {
    val testString = "A man a plan a canal Panama"
    val result = isPalindrome(testString)
    println(result)  // Output: true
}