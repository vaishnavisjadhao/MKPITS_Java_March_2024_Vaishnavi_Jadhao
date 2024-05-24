package assignment;

import java.util.LinkedList;

//27. Write a Java program to insert the specified element at the specified position in the linked list.
public class Assignment27 {
    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList<>(){{
           add(10);
           add(20);
           add(30);
           add(40);
           add(50);
        }};
        System.out.println(numbers);

        numbers.add(1, 60);
        System.out.println(numbers);
    }
}
