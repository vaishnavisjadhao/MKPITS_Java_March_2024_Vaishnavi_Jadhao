package assignment.vector;

import java.util.Vector;

//1. Vector Operations: Implement a Java program that performs various operations on a vector,
// such as adding elements, removing elements, finding the size of the vector, and displaying its
// contents.
public class Assignment1 {
    public static void main(String[] args) {
        Vector <String> vector = new Vector<>(){{
            //add element
            add("Blue");
            add("Black");
            add("Green");
            add("White");
            add("Red");
        }};
        //display contents
        System.out.println(vector);

        //size of vector
        System.out.println("size of vector: "+vector.size());

        //removing element
        vector.remove(2);
        System.out.println("\nRemove Element(green) on index no 2: "+vector);

    }
}
