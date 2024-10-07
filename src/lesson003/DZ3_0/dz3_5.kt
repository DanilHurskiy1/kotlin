package lesson003.DZ3_0

fun main() {
    var product = 1
    for (i in 1..5) {
        product *= i
    }
    println("Добуток чисел від 1 до 5: $product")
}