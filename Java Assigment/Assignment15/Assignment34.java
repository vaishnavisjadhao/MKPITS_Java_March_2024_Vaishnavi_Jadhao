package assignment;

import java.util.LinkedList;

//34. Write a Java program to remove a specified element from a linked list.
public class Assignment34 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);

        list.remove(1);
        System.out.println("remove element at second position: "+list);
    }
}
