package lesson005.DZ5_0

// Є список імен: ["Олександр", "Ольга", "Олена", "Олексій"]. Виведіть тільки ті імена, які починаються на "Ол".

fun main() {
    val names = listOf("Олександр", "Ольга", "Олена", "Олексій", "Гріша")
    val namesWithOl = names.filter { it.startsWith("Ол") }
    println(namesWithOl)
}