package task5;

public class File extends AbstractFileSystemNode{
    public File(String name){
        this.name = name;
    }

    public String getFileExtension(){
        return name.substring(name.lastIndexOf('.'));
    }

    @Override
    public String toString() {
        return name;
    }
}
