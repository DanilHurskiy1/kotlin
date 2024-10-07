package lesson002.DZ2_0

fun main() {
    val number: Int = 15

    val result = if (number % 3 == 0 && number % 5 == 0) {
        "FizzBuzz"
    } else if (number % 3 == 0) {
        "Fizz"
    } else if (number % 5 == 0) {
        "Buzz"
    } else {
        number.toString()
    }

    println(result)
}