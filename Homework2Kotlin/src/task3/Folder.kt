package task3

class Folder(name: String?, vararg fileSystemNodes: FileSystemNode?) : AbstractFileSystemNode() {
    var list = mutableListOf(*fileSystemNodes)

    init {
        this.name = name
    }

    fun add(fileSystemNode: FileSystemNode) {
        list.add(fileSystemNode)
    }

    override fun toString(): String {
        return "$name: $list"
    }
}