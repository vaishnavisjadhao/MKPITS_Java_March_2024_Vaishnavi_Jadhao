package assignment;

import java.util.LinkedList;

//23. Write a Java program to append the specified element to the end of a linked list.
public class Assignment23 {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList= new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        System.out.println(linkedList);

        linkedList.addLast(6);
        System.out.println(linkedList);

    }
}
