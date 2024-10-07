package lesson001.DZ

fun prikolAND(value1: Boolean, value2: Boolean): Boolean {
    return value1 && value2
}

fun main() {
    val result = prikolAND(true, false)
    println("Resyltat: $result")
}