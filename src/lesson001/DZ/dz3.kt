package lesson001.DZ

fun main() {
    val mutableList: MutableList<String> = mutableListOf("A", "B", "C", "D", "E")
    println("1) $mutableList")

    mutableList.remove("C")
    println("2) Remove C: $mutableList")

    mutableList[mutableList.indexOf("D")] = "F"
    println("3) Zamena D na F: $mutableList")
    println("4) $mutableList")
}