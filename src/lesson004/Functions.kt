package lesson004

fun main() {
    testPrint()
    testPrintWithText("Kotlin")
    testPrintWithDefaultText( "HEEEEEEEEEEE")
    sum(5, 6)

    val result = sumA(12, 6)
    println(result)
}

fun sumA (a: Int, b: Int): Int {
    return a + b
}

fun sum (a: Int, b: Int) {
    println(a + b)
}

fun testPrintWithDefaultText(text: String = "Alex") {
    println("$text Hello!")
}

fun testPrintWithText(text: String) {
    println("$text Hello!")
}

fun testPrint() {
    println("Hello")
}