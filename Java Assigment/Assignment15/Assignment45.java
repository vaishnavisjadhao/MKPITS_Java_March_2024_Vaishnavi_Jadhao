package assignment;

import java.util.Collections;
import java.util.LinkedList;

//45. Write a Java program to compare two linked lists.
public class Assignment45 {
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
            add(2);
            add(30);
            add(4);
            add(50);
        }};
        System.out.println("List2: "+list2);

        LinkedList <String> list3 = new LinkedList<>();
        for (Object o:list1){
            list3.add(list2.contains(o) ? "Yes" : "No" );
            System.out.println(list3);
        }
    }
}
