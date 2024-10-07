package lesson002

fun main() {
//    if (умова){
//        // код true
//    }else{
//        // код false
//    }

//    val a = 2
//    val b = 20

//    val max = if (a > b) a else b
//    println(max)
//
//    if (a > b){
//        println("$a більше $b")
//    }else if(a == b){
//        println("$a рівне $b")
//    }else{
//        println("$a менше $b")
//    }

//    switchCase
//    when (вираз){
//        значення1 -> println("$a більше $b")
//        значення2 -> println("$a рівне $b")
//        значення3 -> {
//            println("$a менше $b")
//            println("Додатковий код")
//        }
//        else -> println("$a менше $b")
//    }

//    val day = 2
//    when(day){
//        1 -> println("Понеділок")
//        2 -> println("Вівторок")
//        3 -> println("Середа")
//        4 -> println("Четвер")
//        5 -> println("П'ятниця")
//        6 -> println("Субота")
//        7 -> println("Неділя")
//        else -> println("Невірний день")
//    }


    val a = 5
    val b = 1
    val x = 5


    checkType(obj = x)
    checkType(obj = "x")
    checkType(obj = 'x')

//    when(x){
//        1,2 -> println("мале число")
//        in 3..10 -> println("середнє число")
//        else -> println("велике число")
//    }


}

fun checkType(obj: Any){
    when(obj){
        is String -> println("Це рядок")
        is Int -> println("Це ціле число")
        else -> println("Невідомий тип")
    }
}