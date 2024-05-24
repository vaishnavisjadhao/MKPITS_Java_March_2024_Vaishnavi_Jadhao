package assignment;

import java.util.LinkedList;

//28. Write a Java program to insert elements into the linked list at the first and last positions.
public class Assignment28 {
    public static void main(String[] args) {
        LinkedList <Integer> insert = new LinkedList<>();
        insert.add(11);
        insert.add(22);
        insert.add(33);
        insert.add(44);
        insert.add(55);
        System.out.println(insert);

        insert.addFirst(1);
        insert.addLast(99);

        System.out.println("Insert 1 at first position & 99 at last position: "+insert);
    }
}
