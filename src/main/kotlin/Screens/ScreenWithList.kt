package Screens

interface ScreenWithList<T> {

    val list: MutableList<T>


    fun showCommandList() {
        println("1. Создать элемент")
        println("2. Выход")
        list.forEachIndexed { index, t -> println("${index + 3}. ${t.toString()};") }

    }
}
