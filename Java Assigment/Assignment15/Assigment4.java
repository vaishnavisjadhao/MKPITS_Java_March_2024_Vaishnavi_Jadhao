package assignment;

import java.util.ArrayList;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Assigment4 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        System.out.println("ArrayList: "+numbers);

        //retrieve element from given array
        System.out.println("\nRetrieve element from 2 index no: "+numbers.get(2));

        for (int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
