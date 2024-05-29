package assignment.vector;

import java.util.Collections;
import java.util.Vector;

//2. Vector Sorting: Write a Java program that sorts a vector of integers in ascending order using
// the Vector class. Implement sorting algorithms such as bubble sort, selection sort, or insertion sort.
public class Assignment2 {
    public static void main(String[] args) {
        Vector <Integer> vector = new Vector<>();
        vector.add(36);
        vector.add(72);
        vector.add(12);
        vector.add(48);
        vector.add(60);
        vector.add(24);
        System.out.println(vector);
        //sorted vector
        Collections.sort(vector);
        System.out.println("\nSorted Vector: "+vector);


    }
}
