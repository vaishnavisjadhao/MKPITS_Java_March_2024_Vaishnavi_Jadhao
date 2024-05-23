package assignment;

import java.util.ArrayList;

//    2. Write a Java program to iterate through all elements in an array list.
public class Assigment2 {
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yello");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Black");

        for(Object clr:colors) {
            System.out.println(clr);
        }

    }
}
