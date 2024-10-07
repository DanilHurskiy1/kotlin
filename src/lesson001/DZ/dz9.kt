package lesson001.DZ

fun convertListToString(chars: List<Char>): String {
    return chars.joinToString("")
}

fun main() {
    val charList = listOf('N', 'i', 'k', 'e', ' ', 'P', 'r', 'o')
    val resultString = convertListToString(charList)
    println(resultString)
}