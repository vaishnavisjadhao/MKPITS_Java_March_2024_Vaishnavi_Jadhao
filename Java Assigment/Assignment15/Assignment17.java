package assignment;

import java.util.ArrayList;

//17. Write a Java program to empty an array list.
public class Assignment17 {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>(){{
           add("Mango");
           add("Apple");
           add("Banana");
           add("Orange");
           add("Grapes");
        }};
        System.out.println(fruits);

        fruits.clear();
        System.out.println("\nEmpty Arraylist: "+fruits);
    }
}
