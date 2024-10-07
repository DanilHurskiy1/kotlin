package lesson003.DZ3_0

fun main() {
    val str = "Hello, World!"
    val vowels = "aeiouAEIOU"
    var count = 0

    for (char in str) {
        if (char in vowels) {
            count++
        }
    }

    println("Кількість голосних літер у рядку: $count")
}