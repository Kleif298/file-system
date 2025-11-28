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
        Collections.sort(objects);

        System.out.println("📁 " + name + " (" + getSize() + " KB)");
        for (FileSystemObject o : objects) {
            System.out.println("   - " + o);
        }
    }
}

