package lesson004.DZ4_0

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val result = isEven(5)
    println(result)
}