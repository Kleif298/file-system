package org.example;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemObject implements Sizable {

    private final List<FileSystemObject> objects;

    public Directory(String name) {
        super(name);
        this.objects = new ArrayList<>();
    }

    public void add(FileSystemObject obj) {
        if (obj == null) return;
        objects.add(obj);
    }

    public void remove(FileSystemObject obj) {
        if (obj == null) return;
        objects.remove(obj);
    }

    public List<FileSystemObject> getObjects() {
        return new ArrayList<>(objects);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemObject o : objects) {
            total += o.getSize();
        }
        return total;
    }

    @Override
    public void print(int indent) {
        System.out.println(indentString(indent) + "[DIR] " + getName() + " (" + getSize() + " KB)");
        for (FileSystemObject o : objects) {
            o.print(indent + 2);
        }
    }

    public void print() {
        print(0);
    }
}
