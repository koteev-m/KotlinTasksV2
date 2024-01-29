package tasks.arithmetic

fun main() {
    var crystalOre = 7
    var ironOre = 11
    val buffPercentage = 20
    val totalPercent = 100

    val bonusCrystalOre = crystalOre * buffPercentage / totalPercent
    val bonusIronOre = ironOre * buffPercentage / totalPercent

    println("""
        Бонусная кристаллическая руда: $bonusCrystalOre
        Бонусная металлическая руда: $bonusIronOre
    """.trimIndent())
}