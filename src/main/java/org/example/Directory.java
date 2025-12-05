package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory extends FileSystemObject implements Sizable {

    private List<FileSystemObject> objects;

    public Directory(String name) {
        super(name);
        this.objects = new ArrayList<>();
    }

    public void add(FileSystemObject obj) {
        objects.add(obj);
    }

    public void remove(FileSystemObject obj) {
        objects.remove(obj);
    }

    public List<FileSystemObject> getObjects() {
        return objects;
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemObject o : objects) {
            total += o.getSize();
        }
        return total;
    }

    public void print() {
        print("");
    }

    @Override
    public void print(String indent) {
        Collections.sort(objects);

        System.out.println(indent + "📁 " + name + " (" + getSize() + " KB)");

        String childIndent = indent + "    "; // 4 Leerzeichen mehr

        for (FileSystemObject o : objects) {
            o.print(childIndent);
        }
    }
}

