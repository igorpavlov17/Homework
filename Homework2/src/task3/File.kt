package task3

class File(name: String?) : AbstractFileSystemNode() {
    init {
        this.name = name
    }

    val fileExtension: String
        get() = name!!.substring(name!!.lastIndexOf('.'))

    override fun toString(): String {
        return name!!
    }
}