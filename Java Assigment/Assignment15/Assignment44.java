package assignment;

import java.util.ArrayList;
import java.util.LinkedList;

//44. Write a Java program to convert a linked list to an array list.
public class Assignment44 {
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList<>() {{
            add("A");
            add("B");
            add("C");
            add("D");
        }};
        System.out.println(linkedList);

        ArrayList <String> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);

    }
}
