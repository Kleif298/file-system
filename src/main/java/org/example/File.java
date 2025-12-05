package org.example;

public class File extends FileSystemObject implements Sizable {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        // Gibt die Datei mit der aktuellen Einrückung aus.
        System.out.println(indent + "📄 " + toString());
    }
}

