package tasks.operators

fun main() {
    val trainingDay = 5

    val exercisesForArmsAndAbs = trainingDay % 2 == 1
    val exercisesForLegsAndBack = trainingDay % 2 == 0

    println("""
        Упражнения для рук:    $exercisesForArmsAndAbs
        Упражнения для ног:    $exercisesForLegsAndBack
        Упражнения для спины:  $exercisesForLegsAndBack
        Упражнения для пресса: $exercisesForArmsAndAbs
    """.trimIndent())
}