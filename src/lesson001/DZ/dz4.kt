package lesson001.DZ

fun main() {
    val doubleValue: Double = 43.789
    val longValue: Long = 912630414L

    println("Double: $doubleValue")
    println("Long: $longValue")

    val floatValue: Float = doubleValue.toFloat()
    println("Double to Float: $doubleValue -> $floatValue")

    val intValue: Int = longValue.toInt()
    println("Long to Int: $longValue -> $intValue")



    val newDoubleValue: Double = floatValue.toDouble()
    println("Float to Double: $floatValue -> $newDoubleValue")


    val newLongValue: Long = intValue.toLong()
    println("Int to Long: $intValue -> $newLongValue")
}