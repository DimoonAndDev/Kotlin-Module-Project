package utility

import java.util.*

fun <T> getCommand(list: MutableList<T>): Int {
    val input = Scanner(System.`in`)
    var command: Int
    getcommand@ while (true) {
        try {
            command = input.nextLine().toInt()
        } catch (e: NumberFormatException) {
            command = 0
        }
        when {
            command == 0 -> println("Введите число - номер элемента от 1 до ${list.size + 2}!")
            command < 0 || (command > list.size + 2) -> println("Введите номер элемента: от 1 до ${list.size + 2}")
            else -> {
                return command
            }
        }
    }
}