package assignment;

import java.util.HashSet;
import java.util.Set;

//59. Write a Java program to compare two sets and retain elements that are the same.
public class Assignment59 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");
        System.out.println("Set 1: " + set1);


        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Date");
        set2.add("Fig");
        set2.add("Grape");
        System.out.println("Set 1: " + set2);

        set1.retainAll(set2);
        System.out.println("Same elements: " + set1);

    }
}
