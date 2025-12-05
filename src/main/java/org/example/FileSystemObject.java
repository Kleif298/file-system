package org.example;

public abstract class FileSystemObject implements Comparable<FileSystemObject> {

    protected String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Wird von File & Directory überschrieben
    public abstract int getSize();

    public abstract void print(String indent);

    @Override
    public int compareTo(FileSystemObject other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + getSize() + " KB)";
    }
}

