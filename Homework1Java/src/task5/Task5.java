package task5;

public class Task5 {
    public static void main(String[] args) {
        Folder root = new Folder("Root", new File("file1.txt"), new File("file2.exe"));
        Folder folder1 = new Folder("Folder1", new File("game.exe"), new File("movie.mp4"), new File("text.txt"));
        Folder folder2 = new Folder("Folder2", new File("document.docx"), new File("video.avi"), new File("picture.png"));
        root.add(folder1);
        root.add(folder2);
        File file = new File("file.txt");
        folder2.add(file);

        System.out.println(folder1.getList().get(1).getPath()); // отобразить путь до файла
        System.out.println(file.getFileExtension()); // отобразить расширение файла
    }
}
