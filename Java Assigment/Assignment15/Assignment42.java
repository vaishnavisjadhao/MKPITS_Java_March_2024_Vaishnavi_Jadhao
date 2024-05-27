package assignment;

import java.util.LinkedList;

//42. Write a Java program to retrieve, but not remove, the first element of a linked list.
public class Assignment42 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>() {{
           add("A");
           add("B");
           add("C");
           add("D");
        }};
        System.out.println(list);

        System.out.println("first element: "+list.peek());
        System.out.println(list);
    }
}
