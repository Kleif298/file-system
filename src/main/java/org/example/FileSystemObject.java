package org.example;

public abstract class FileSystemObject implements Comparable<FileSystemObject> {

    private final String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize();

    public void print(int indent) {
        System.out.println(indentString(indent) + toString());
    }

    protected String indentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) sb.append(' ');
        return sb.toString();
    }

    @Override
    public int compareTo(FileSystemObject other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + getSize() + " KB)";
    }
}
