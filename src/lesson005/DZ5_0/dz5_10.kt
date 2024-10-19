package lesson005.DZ5_0

// Є два списки: ["яблуко", "банан", "вишня"] і ["банан", "вишня", "груша"]. Знайдіть спільні елементи між двома списками.

fun main() {
    val list1 = listOf("яблуко", "банан", "вишня")
    val list2 = listOf("банан", "вишня", "груша")
    val commonElements = list1.intersect(list2)
    commonElements.forEach { println(it) }
}