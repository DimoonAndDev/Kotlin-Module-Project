package dataClasses

data class Archive(
    val name: String,
    val list: MutableList<Note>
) {
    override fun toString(): String {
        return name
    }
}
