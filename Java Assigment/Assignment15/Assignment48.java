package assignment;

import java.util.LinkedList;

//48. Write a Java program to replace an element in a linked list.
public class Assignment48 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(){{
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
        }};
        System.out.println(numbers);

        numbers.set(1, 60);
        System.out.println("replace element 20 with 60"+numbers);
    }
}
