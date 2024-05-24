package assignment;

import java.util.ArrayList;

//18. Write a Java program to test whether an array list is empty or not.
public class Assignment18 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(){{
            add("Mango");
            add("Apple");
            add("Banana");
            add("Orange");
            add("Grapes");
        }};
        System.out.println(fruits);

        if(fruits.isEmpty()){
            System.out.println("\nArrayList is empty");
        } else {
            System.out.println("\nList are not Empty");
        }
    }
}
