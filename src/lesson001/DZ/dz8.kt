package lesson001.DZ

fun modifyList(strings: MutableList<String>): MutableList<String> {
    strings.add(0, "nowaZufra")
    strings.removeAt(strings.size - 1)

    return strings
}

fun main() {
    val mutableList = mutableListOf("one", "two", "three", "four", "five")
    val modifiedList = modifyList(mutableList)
    println(modifiedList)
}