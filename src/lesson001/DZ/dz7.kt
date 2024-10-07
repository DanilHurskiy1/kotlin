package lesson001.DZ

fun filterMasiva(strings: List<String>): List<String> {
    return strings.filter { it.length > 3 }
}

fun main() {
    val normalList = listOf("one", "two", "three", "four", "five")
    val filteredList = filterMasiva(normalList)
    println(filteredList)
}