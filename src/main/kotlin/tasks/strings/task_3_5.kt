package tasks.strings

fun main() {
    val moveInformation = "D2-D4;0"

    val (move, moveNumber) = moveInformation.split(";")
    val(fromWhere, where) = move.split("-")

    println("Номер хода: $moveNumber")
    println("Откуда: $fromWhere")
    println("Куда: $where")
}