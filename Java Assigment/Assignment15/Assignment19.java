package assignment;

import java.util.ArrayList;

//19. Write a Java program for trimming the capacity of an array list.
public class Assignment19 {
    public static void main(String[] args) {
        ArrayList <String> newArray = new ArrayList<>(10);

        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        newArray.add("Four");
        newArray.add("Five");

        System.out.println(newArray);

        System.out.println("\nTrim The Capacity of arraylist");
        newArray.trimToSize();
        System.out.println(newArray);
    }
}
