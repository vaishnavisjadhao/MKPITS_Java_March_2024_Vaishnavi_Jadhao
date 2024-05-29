package assignment.vector;

import java.util.Vector;

//Create a Java program that manipulates two vectors, performing operations like vector addition, subtraction, scalar multiplication,
//and dot product calculation using the Vector class.
public class Assignment4 {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>(){{
            add(2);
            add(4);
            add(6);
            add(8);
        }};
        System.out.println(vector1);

        Vector <Integer> vector2 = new Vector<>(){{
            add(3);
            add(6);
            add(9);
            add(12);
        }};
        System.out.println(vector2);

        System.out.println("\nAddition of vector");
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i)+vector2.get(i));
        }

        System.out.println("\nsubtraction of vector");
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i)-vector2.get(i));
        }

        System.out.println("\nMultiplication of vector");
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i)*vector2.get(i));
        }
    }
}
