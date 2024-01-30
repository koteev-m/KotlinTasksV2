package tasks.arithmetic

import kotlin.math.pow

fun main() {
    val initialDeposit = 70000
    val annualInterestRate = 16.7 / 100
    val years = 20

    val futureValue = initialDeposit * (1 + annualInterestRate).pow(years)
    val formattedResult = "%.3f".format(futureValue)

    println(formattedResult)
}

