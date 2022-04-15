package task5;

import java.util.ArrayList;
import java.util.Collections;

public class Folder extends AbstractFileSystemNode{
    private ArrayList<FileSystemNode> list = new ArrayList<>();

    public Folder(String name, FileSystemNode ... fileSystemNodes){
        this.name = name;
        Collections.addAll(list, fileSystemNodes);
    }

    public void add(FileSystemNode fileSystemNode){
        list.add(fileSystemNode);
    }

    public ArrayList<FileSystemNode> getList() {
        return list;
    }

    @Override
    public String toString() {
        return name + ": " + list;
    }
}
