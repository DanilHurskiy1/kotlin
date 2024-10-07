package lesson004.DZ4_0

fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun main() {
    val result = factorial(5)
    println(result)
}