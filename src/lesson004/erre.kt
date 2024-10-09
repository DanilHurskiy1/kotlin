package lesson004

fun main() {
    var sum = 0
    for (i in 1..365) {
        sum += i
    }
    println("Sum of 1 to 365 is $sum")
    println(sum)
}