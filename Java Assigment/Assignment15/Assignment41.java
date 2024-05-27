package assignment;

import java.util.LinkedList;

//41. Write a Java program to remove and return the first element of a linked list.
public class Assignment41 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);

        list.pop();
        System.out.println(list);
    }
}
