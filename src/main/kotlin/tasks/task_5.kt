package tasks

import kotlin.concurrent.timer

fun main() {
    val totalSecondsInSpace = 6480

    val secondsInMinute = 60
    val secondsInHour = 3600

    val hours = totalSecondsInSpace / secondsInHour
    val minutes = (totalSecondsInSpace % secondsInHour) / secondsInMinute
    val seconds = totalSecondsInSpace % secondsInMinute

    println("$hours:$minutes:$seconds".format(hours, minutes, seconds))
}
