package dataClasses

data class Note(
    val name: String,
    var text: String
) {
    override fun toString(): String {
        return name
    }
}

