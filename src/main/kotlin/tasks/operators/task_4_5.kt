package tasks.operators

fun main() {
    println("наличие повреждений корпуса(true/false): ")
    val damage = readln().toBoolean()

    println("текущий состав экипажа: ")
    val numberOfCrew = readln().toInt()

    println("количество ящиков с провизией на борту: ")
    val boxesOfProvision = readln().toInt()

    println("благоприятность метеоусловий(true/false): ")
    val goodWeather = readln().toBoolean()

    val departure = (!damage && numberOfCrew in 55..70 && boxesOfProvision > 50 && goodWeather) ||
            (damage && numberOfCrew == 70 && goodWeather && boxesOfProvision > 50)

    if (departure){
        println("Корабль может отправиться в плавание.")
    }else println("Корабль не может отправиться в плавание.")
}



