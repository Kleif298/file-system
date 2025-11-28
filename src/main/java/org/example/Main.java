package org.example;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root");
        Directory images = new Directory("images");
        Directory docs = new Directory("docs");

        File f1 = new File("bild1.png", 350);
        File f2 = new File("bild2.png", 420);
        File f3 = new File("dokument.txt", 50);

        images.add(f1);
        images.add(f2);
        docs.add(f3);

        root.add(images);
        root.add(docs);

        root.print();
    }
}

