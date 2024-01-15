package Screens


import dataClasses.Archive

class ArchiveListScreen : ScreenWithList<Archive> {
    override val list = mutableListOf<Archive>()

}
