package lesson002.DZ2_0

fun main() {
    val strValue: String = "Hello"

    if (strValue.isNotEmpty() && strValue[0].isUpperCase()) {
        println("Велика літера")
    } else {
        println("Маленька літера")
    }
}