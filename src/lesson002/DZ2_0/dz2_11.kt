package lesson002.DZ2_0

fun main() {
    val firstValue: Int = 10
    val secondValue: Int = 20
    val thirdValue: Int = 15

    val maxValue = if (firstValue >= secondValue && firstValue >= thirdValue) {
        firstValue
    } else if (secondValue >= firstValue && secondValue >= thirdValue) {
        secondValue
    } else {
        thirdValue
    }

    println("Максимальне значення: $maxValue")
}