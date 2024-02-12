package tasks.strings

fun main() {
    val firstName = "Татьяна"
    val lastName = "Андреева"
    val middleName = "Сергеевна"
    var age = 20
    println("$lastName $firstName $middleName, $age")

    val newLastName = "Сидорова"
    age = 22
    println("$newLastName $firstName $middleName, $age")
}