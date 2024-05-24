package assignment;

import java.util.ArrayList;

//11. Write a Java program to reverse elements in an array list.
public class Assignment11 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(36);
        list.add(48);
        list.add(60);
        System.out.println(list);

        System.out.println("Reversed Array list: "+list.reversed());
    }
}
