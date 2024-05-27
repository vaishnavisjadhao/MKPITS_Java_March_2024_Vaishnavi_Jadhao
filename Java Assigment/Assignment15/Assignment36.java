package assignment;

import java.util.LinkedList;

//36. Write a Java program to remove all elements from a linked list.
public class Assignment36 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
