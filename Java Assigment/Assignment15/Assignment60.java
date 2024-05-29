package assignment;

import java.util.HashSet;

//60. Write a Java program to remove all elements from a hash set.
public class Assignment60 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Lemon");
        System.out.println(set);

        // Remove all elements from the HashSet
        set.clear();

        // Display the HashSet after clearing
        System.out.println("after clearing: " + set);

    }
}
