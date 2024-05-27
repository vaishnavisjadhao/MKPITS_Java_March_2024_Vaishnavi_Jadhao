package assignment;

import java.util.LinkedList;

//32. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class Assignment32 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(){{
            add(6);
            add(12);
            add(18);
            add(24);
        }};
        System.out.println(list);

        System.out.println("first element: "+list.getFirst());
        System.out.println("last element: "+list.getLast());
    }
}
