package org.example;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("Dateisystem");
        root.print();

        System.out.println("Suche nach 'bild");
        List<FileSystemObject> found = new ArrayList<>();
        for (FileSystemObject o : root.getObjects()) {
            if (o.getName().toLowerCase().contains("bild")) found.add(o);
            if (o instanceof Directory) {
                for (FileSystemObject sub : ((Directory) o).getObjects()) {
                    if (sub.getName().toLowerCase().contains("bild")) found.add(sub);
                }
            }
        }
        for (FileSystemObject o : found) {
            System.out.println("Gefunden: " + o);
        }

        System.out.println("Verschiebe bild2.png nach docs");
        images.remove(f2);
        docs.add(f2);
        root.print();
    }
}
