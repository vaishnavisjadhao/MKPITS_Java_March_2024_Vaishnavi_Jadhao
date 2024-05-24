package assignment;

import java.util.ArrayList;

//15. Write a Java program to join two array lists.
public class Assignment15 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(){{
            add(11);
            add(21);
            add(31);
            add(41);
            add(51);
        }};
        System.out.println("List 1: "+list1);

        ArrayList <Integer> list2 = new ArrayList<>(){{
            add(11);
            add(22);
            add(33);
            add(44);
            add(55);
        }};
        System.out.println("List 2: " +list2);

        list1.addAll(list2);
        System.out.println("\nAfter Joining Two ArrayList: "+list1);

    }
}
