package lesson005.DZ5_0

// Створіть Map, де ключами будуть назви країн, а значеннями — їхні столиці. Додайте до мапи кілька країн та їхні столиці, а потім виведіть столицю України.

fun main() {
    val countriesAndCapitals = mapOf<String, String>(
        "Ukraine" to "Kyiv",
        "France" to "Paris",
        "Germany" to "Berlin",
        "Italy" to "Rome"
    )

    val capitalOfUkraine = countriesAndCapitals["Ukraine"]
    println("The capital of Ukraine is: $capitalOfUkraine")
}