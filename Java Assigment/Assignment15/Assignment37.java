package assignment;

import java.util.Collections;
import java.util.LinkedList;

//37. Write a Java program that swaps two elements in a linked list.
public class Assignment37 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(){{
            add(10);
            add(11);
            add(12);
            add(13);
            add(14);
        }};
        System.out.println("Before Swap: "+list);

        //swap element 11 with 12
        Collections.swap(list, 1,2);
        System.out.println("After Swap: "+list);
    }
}
