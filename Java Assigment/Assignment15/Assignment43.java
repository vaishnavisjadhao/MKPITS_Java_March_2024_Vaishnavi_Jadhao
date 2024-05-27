package assignment;

import java.util.LinkedList;

//43. Write a Java program to retrieve, but not remove, the last element of a linked list.
public class Assignment43 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>() {{
            add("A");
            add("B");
            add("C");
            add("D");
        }};
        System.out.println(list);

        System.out.println("last element: "+list.peekLast());
        System.out.println(list);
    }
}
