package tasks.operators

fun main() {
    val weather = SUNNY_WEATHER
    val tent = TENT_OPEN
    val airHumidity = 20
    val currentSeason = "зима"

    val favorableConditions = weather && tent && (airHumidity == AIR_HUMIDITY) && (currentSeason != CURRENT_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val SUNNY_WEATHER = true
const val TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val CURRENT_SEASON = "зима"


