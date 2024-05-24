package assignment;

import java.util.LinkedList;

//29. Write a Java program to insert the specified element at the front of a linked list.
public class Assignment29 {
    public static void main(String[] args) {
        LinkedList<Integer> insert = new LinkedList<>();
        insert.add(11);
        insert.add(22);
        insert.add(33);
        insert.add(44);
        insert.add(55);
        System.out.println(insert);

        insert.addFirst(100);
        System.out.println("100 insert at front position: "+insert);
    }
}
