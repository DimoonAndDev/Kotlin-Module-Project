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
        programWorks@ while (true) {
            archiveListScreen.showCommandList()
            when (val commandArchiveScreen = getCommand(archiveListScreen.list)) {
                1 -> archiveListScreen.list.add(createArchive())
                2 -> break@programWorks
                else -> {

                    val noteListScreen =
                        NoteListScreen(archiveListScreen.list.get(commandArchiveScreen - 3).list)
                    noteScreen@ while (true) {
                        noteListScreen.showCommandList()
                        when (val commandNoteScreen = getCommand(noteListScreen.list)) {
                            1 -> noteListScreen.list.add(createNote())
                            2 -> break@noteScreen
                            else -> {
                                note@ while (true) {
                                    val noteScreen =
                                        NoteScreen(noteListScreen.list.get(commandNoteScreen - 3))
                                    noteScreen.showCommand()
                                    when (getCommand(mutableListOf(null))) {
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