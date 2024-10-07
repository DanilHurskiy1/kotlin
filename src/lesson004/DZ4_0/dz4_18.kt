package lesson004.DZ4_0

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun daysBetween(startDate: LocalDate, endDate: LocalDate): Long {
    return ChronoUnit.DAYS.between(startDate, endDate)
}

fun main() {
    val startDate = LocalDate.of(2023, 10, 1)
    val endDate = LocalDate.of(2023, 10, 10)
    val daysBetween = daysBetween(startDate, endDate)
    println("The number of days between $startDate and $endDate is $daysBetween days")
}