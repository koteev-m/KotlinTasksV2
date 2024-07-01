package tasks.if_when

fun main() {

    println("Сложите 2 и 3, и напишите результат:")
    val result = readln().toInt()

    val textResult = if (result == 5) "Добро пожаловать!"
    else "Доступ запрещен."

    println(textResult)
}