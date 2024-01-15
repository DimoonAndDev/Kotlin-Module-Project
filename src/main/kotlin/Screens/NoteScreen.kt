package Screens

import dataClasses.Note

class NoteScreen(val note: Note) {

    fun showCommand() {
        println("1. Открыть заметку")
        println("2. Назад")
    }

    fun showNote() {
        // Everything after this is in red
        val red = "\u001b[31m"

// Resets previous color codes
        val reset = "\u001b[0m"

        println("$red${note.name}$reset")
        println(note.text)

    }
}