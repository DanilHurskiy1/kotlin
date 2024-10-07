package lesson002.DZ2_0

fun main() {
    val doubleValue: Double = 150.5

    if (doubleValue > 100.0) {
        val intValue: Int = doubleValue.toInt()
        println(intValue)
    } else {
        println(doubleValue)
    }
}
