package lesson001.DZ

fun reverseString(input: String): String {
    return input.reversed()
}

fun main() {
    val normalnuuString: String = "Karavanchuk"
    val perebrav = reverseString(normalnuuString)
    println("$normalnuuString -> $perebrav")
}