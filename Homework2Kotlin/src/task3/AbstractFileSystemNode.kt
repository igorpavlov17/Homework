package task3

abstract class AbstractFileSystemNode : FileSystemNode {
    override var name: String? = null
    override val fileSystemNode: FileSystemNode
        get() = this
    override val path: String
        get() {
            return super.toString() + '.' + name
        }
}