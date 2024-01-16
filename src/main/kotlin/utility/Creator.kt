package utility

import dataClasses.Archive
import dataClasses.Note
import java.util.Scanner

fun createNote(): Note {
    val input = Scanner(System.`in`)

    println("Введите имя заметки")
    val noteName = input.nextLine()
    val noteToAdd = Note(noteName, "")
    println("Введите текст заметки")
    noteToAdd.text = input.nextLine()
    return noteToAdd
}

fun createArchive(): Archive {
    val input = Scanner(System.`in`)

    println("Введите имя архива")
    val archname = input.nextLine()
    val archiveToAdd = Archive(archname, mutableListOf())
    return archiveToAdd
}