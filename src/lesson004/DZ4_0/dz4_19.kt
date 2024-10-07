package lesson004.DZ4_0

fun calculatePercentage(number: Double, percentage: Double): Double {
    return number * (percentage / 100)
}

fun main() {
    val number = 200.0
    val percentage = 15.0
    val result = calculatePercentage(number, percentage)
    println("$percentage% of $number is $result")
}