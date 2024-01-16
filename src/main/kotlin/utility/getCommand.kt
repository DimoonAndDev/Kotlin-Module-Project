package utility

import java.util.*

fun <T> getCommand(list: MutableList<T>, noteScreenFlag: Boolean): Int {
    val input = Scanner(System.`in`)
    var command: Int
    getcommand@ while (true) {
        try {
            command = input.nextLine().toInt()
        } catch (e: NumberFormatException) {
            command = 0
        }
        if (!noteScreenFlag) {
            when {
                command == 0 -> println("Введите число - номер элемента от 1 до ${list.size + 2}!")
                command < 0 || (command > list.size + 2) -> println("Введите номер элемента: от 1 до ${list.size + 2}")
                else -> {
                    break@getcommand
                }
            }
        } else {
            when {
                command == 0 -> println("Введите число - 1 для просмотра заметки, 2 для возврата к архивам")
                command < 0 || (command > 2) -> println("Введите 1 для просмотра заметки, 2 для возврата к архивам")
                else -> {
                    break@getcommand
                }
            }
        }

    }
    return command
}