package lesson001.DZ

fun main() {
    val byteMax: Byte = Byte.MAX_VALUE
    val byteMin: Byte = Byte.MIN_VALUE
    val shortMax: Short = Short.MAX_VALUE
    val shortMin: Short = Short.MIN_VALUE
    val intMax: Int = Int.MAX_VALUE
    val intMin: Int = Int.MIN_VALUE
    val longMax: Long = Long.MAX_VALUE
    val longMin: Long = Long.MIN_VALUE
    val floatMax: Float = Float.MAX_VALUE
    val floatMin: Float = -Float.MAX_VALUE
    val doubleMax: Double = Double.MAX_VALUE
    val doubleMin: Double = -Double.MAX_VALUE
    val charMax: Char = Char.MAX_VALUE
    val charMin: Char = Char.MIN_VALUE
    val stringMax: String = "This is a string"
    val booleanTrue: Boolean = true
    val booleanFalse: Boolean = false

    println("Byte Max: $byteMax, Byte Min: $byteMin")
    println("Short Max: $shortMax, Short Min: $shortMin")
    println("Int Max: $intMax, Int Min: $intMin")
    println("Long Max: $longMax, Long Min: $longMin")
    println("Float Max: $floatMax, Float Min: $floatMin")
    println("Double Max: $doubleMax, Double Min: $doubleMin")
    println("Char Max: $charMax, Char Min: $charMin")
    println("String: $stringMax")
    println("Boolean True: $booleanTrue, Boolean False: $booleanFalse")
}
