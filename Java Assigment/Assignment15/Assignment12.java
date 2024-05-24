package assignment;

import java.util.ArrayList;

//12. Write a Java program to extract a portion of an array list.
public class Assignment12 {
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yello");


        System.out.println(colors);

        System.out.println(colors.subList(0,3));
    }
}
