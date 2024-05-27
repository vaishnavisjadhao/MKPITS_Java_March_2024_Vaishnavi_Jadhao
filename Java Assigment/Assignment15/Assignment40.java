package assignment;

import java.util.Collections;
import java.util.LinkedList;

//40. Write a Java program to copy a linked list to another linked list.
public class Assignment40 {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        System.out.println(list);

        LinkedList <Integer> newList = new LinkedList<>();
        newList = (LinkedList)list.clone();
        System.out.println(newList);
    }
}
