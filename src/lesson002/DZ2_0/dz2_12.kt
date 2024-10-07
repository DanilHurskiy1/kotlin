package lesson002.DZ2_0

fun main() {
    val strValue: String = " "

    if (strValue.isEmpty()) {
        println("Рядок порожній")
    } else if (strValue.isBlank()) {
        println("Рядок містить лише пробіли")
    } else {
        println(strValue)
    }
}