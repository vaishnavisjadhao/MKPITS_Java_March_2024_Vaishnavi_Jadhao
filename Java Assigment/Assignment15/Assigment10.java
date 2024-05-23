package assignment;

import java.util.ArrayList;
import java.util.Collections;

//10. Write a Java program to shuffle elements in an array list.
public class Assigment10 {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(24);
        list1.add(36);
        list1.add(48);
        list1.add(60);
        System.out.println(list1);

        Collections.shuffle(list1);
        System.out.println("After Shuffling" +list1);
    }
}
