package lesson004

fun main() {
    val car = Car()
    car.create()
    val car2 = Car("Audi", "A4", 4)
    car2.create()
    val car3 = Car("Mercedes", "S500", 4)
    car3.create()

    val user1 = User("Alex", "email@gmail.com")
    println(user1)
    val user2 = user1.copy(name = "John")
    println(user2)
}

data class User(
    val name: String,
    val email: String,
)

class Car(
    val name: String = "BMW",
    val model: String = "X5",
    val wheels: Int = 4,
) {
   fun create() {
       println("Car $name $model with $wheels wheels created")
   }
}