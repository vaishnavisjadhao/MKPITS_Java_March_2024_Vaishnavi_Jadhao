package assignment;

import java.util.LinkedList;

//30. Write a Java program to insert the specified element at the end of a linked list.
public class Assignment30 {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>(){{
           add(1);
           add(2);
           add(3);
           add(4);
           add(5);
        }};
        System.out.println(linkedList);

        linkedList.addLast(100);
        System.out.println("Element added at End position: "+ linkedList);
    }
}
