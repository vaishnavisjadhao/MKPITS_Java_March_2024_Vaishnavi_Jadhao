package assignment;

import java.util.LinkedList;

//35. Write a Java program to remove the first and last elements from a linked list.
public class Assignment35 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>(){{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
        }};
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println("remove element A and E: "+list);
    }
}
