package tasks.arithmetic

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457
    val minuteInHour = 60

    val arrivalTimeMinutes = departureHour * minuteInHour + departureMinute + travelTimeMinutes
    val arrivalHour = arrivalTimeMinutes / minuteInHour
    val arrivalMinute = arrivalTimeMinutes % minuteInHour

    println("Поезд прибудет в $arrivalHour:$arrivalMinute")

}