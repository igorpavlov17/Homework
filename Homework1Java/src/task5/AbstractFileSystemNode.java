package task5;

public abstract class AbstractFileSystemNode implements FileSystemNode{
    String name;

    public final FileSystemNode getFileSystemNode() {
        return this;
    }

    public String getName() {
        return name;
    }

    public final String getPath() {
        super.toString();
        return super.getClass().getName() + '.' + this.getName();
    }
}
