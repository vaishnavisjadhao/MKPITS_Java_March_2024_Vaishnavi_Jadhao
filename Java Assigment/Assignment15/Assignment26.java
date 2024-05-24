package assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//26. Write a Java program to iterate a linked list in reverse order.
public class Assignment26 {
    public static void main(String[] args) {
        LinkedList <String> color = new LinkedList<>();

        color.add("Red");
        color.add("Yellow");
        color.add("Pink");
        color.add("Black");
        color.add("White");
        System.out.println(color);

        ListIterator<String> iterator = color.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
