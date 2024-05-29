package assignment.vector;

import java.util.Vector;

//3. Vector Search: Develop a Java program that searches for a specific element within a vector using the
//Vector class. Implement algorithms like linear search or binary search to efficiently locate the element.
public class Assignment3 {
    public static void main(String[] args) {
        Vector <Integer> vector = new Vector<>(){{
           add(10);
           add(20);
           add(30);
           add(40);
        }};
        System.out.println(vector);

        System.out.println("Element is found at index no: "+vector.indexOf(20));

        //Using linear search
        // The element to search for
        int searchElement = 20;

        // linear search
        int index = linearSearch(vector, searchElement);

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index: " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the vector.");
        }
    }

    // Method to perform linear search
    public static int linearSearch(Vector<Integer> vector, int element) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }
}

