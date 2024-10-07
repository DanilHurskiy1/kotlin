package lesson004.DZ4_0

fun power(base: Int, exponent: Int): Int {
    return if (exponent == 0) 1 else base * power(base, exponent - 1)
}

fun main() {
    val result = power(2, 3)
    println(result)
}