import Screens.ArchiveListScreen
import Screens.NoteListScreen
import Screens.NoteScreen
import utility.createArchive
import utility.createNote
import utility.getCommand

class Programm {

    fun startProgramm() {
        println("Добро пожаловать в приложение с заметками")
        val archiveListScreen = ArchiveListScreen()
        var noteScreenFlag = false
        programWorks@ while (true) {

            archiveListScreen.showCommandList()
            when (val commandArchiveScreen = getCommand(archiveListScreen.list, noteScreenFlag)) {
                1 -> archiveListScreen.list.add(createArchive())
                2 -> break@programWorks
                else -> {

                    val noteListScreen =
                        NoteListScreen(archiveListScreen.list.get(commandArchiveScreen - 3).list)
                    noteScreen@ while (true) {
                        noteScreenFlag = false
                        noteListScreen.showCommandList()
                        when (val commandNoteScreen =
                            getCommand(noteListScreen.list, noteScreenFlag)) {
                            1 -> noteListScreen.list.add(createNote())
                            2 -> break@noteScreen
                            else -> {
                                note@ while (true) {
                                    noteScreenFlag = true
                                    val noteScreen =
                                        NoteScreen(noteListScreen.list.get(commandNoteScreen - 3))
                                    noteScreen.showCommand()
                                    when (getCommand(mutableListOf(null), noteScreenFlag)) {
                                        1 -> noteScreen.showNote()
                                        else -> break@note
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        println("Пока-пока!")
    }
}