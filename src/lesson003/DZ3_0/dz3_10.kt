package lesson003.DZ3_0

fun factorial(n: Int): Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}

fun main() {
    val number = 5
    val result = factorial(number)
    println("Факторіал числа $number: $result")
}