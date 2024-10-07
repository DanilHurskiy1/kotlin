package lesson001.DZ

fun calculate(numbers: List<Int>): Pair<Int, Double> {
    val sum = numbers.sum()
    val seredny = numbers.average()
    return Pair(sum, seredny)
}

fun main() {
    val intList = listOf(1, 2, 3, 4, 5)
    val (sum, seredny) = calculate(intList)
    println("Sum: $sum")
    println("Average: $seredny")
}