package assignment;

import java.util.Collections;
import java.util.LinkedList;

//38. Write a Java program to shuffle elements in a linked list.
public class Assignment38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(){{
            add("Apple");
            add("Banana");
            add("Coconut");
            add("Guava");
        }};
        System.out.println("Original List: "+list);

        Collections.shuffle(list);
        System.out.println("After Shuffle: "+list);
    }
}
