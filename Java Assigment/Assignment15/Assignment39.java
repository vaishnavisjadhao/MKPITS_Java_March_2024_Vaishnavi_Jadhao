package assignment;

import java.util.LinkedList;

//39. Write a Java program to join two linked lists.
public class Assignment39 {
    public static void main(String[] args) {
        LinkedList<Integer> list1= new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        System.out.println("List1: "+list1);

        LinkedList <Integer> list2= new LinkedList<>(){{
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
        }};
        System.out.println("List2: "+list2);

        //join two linked list
        list1.addAll(list2);
        System.out.println("New Linked List: "+list1);
    }
}
