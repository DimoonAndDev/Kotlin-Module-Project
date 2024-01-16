package utility

import dataClasses.Archive
import dataClasses.Note
import java.util.Scanner

fun createNote(): Note {
    val input = Scanner(System.`in`)
    createNote@while (true){
    println("Введите имя заметки")
    val noteName = input.nextLine()
        if (noteName.trim().isEmpty()) continue
    println("Введите текст заметки")
    val text = input.nextLine()
        if (text.trim().isEmpty()) continue
    return Note(noteName,text)
    }
}

fun createArchive(): Archive {
    val input = Scanner(System.`in`)
    while (true){
    println("Введите имя архива")
    val archname = input.nextLine()
        if (archname.trim().isEmpty()) continue
    val archiveToAdd = Archive(archname, mutableListOf())
    return archiveToAdd
    }
}