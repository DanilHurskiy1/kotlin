package lesson004.DZ4_0

fun gcd(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    }
    return gcd(b, a % b)
}

fun main() {
    val number1 = 56
    val number2 = 98
    val result = gcd(number1, number2)
    println("The GCD of $number1 and $number2 is $result")
}