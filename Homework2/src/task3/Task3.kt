package task3

object Task5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val root = Folder("Root", File("file1.txt"), File("file2.exe"))
        val folder1 = Folder("Folder1", File("game.exe"), File("movie.mp4"), File("text.txt"))
        val folder2 = Folder("Folder2", File("document.docx"), File("video.avi"), File("picture.png"))
        root.add(folder1)
        root.add(folder2)
        val file = File("file.txt")
        folder2.add(file)
        println(root.fileSystemNode)
        println(folder1.list[1]!!.path) // отобразить путь до файла
        println(file.fileExtension) // отобразить расширение файла
    }
}