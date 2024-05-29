package assignment;

import java.util.ArrayList;
import java.util.HashSet;

//58. Write a Java program to compare two hash set.
public class Assignment58 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        //Add Colors in list
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        //print
        System.out.println(colors);

        HashSet<String> colorsNew = new HashSet<>();
        //Add Colors in list
        colorsNew.add("Red");
        colorsNew.add("Pink");
        colorsNew.add("Black");
        colorsNew.add("White");
        //print
        System.out.println(colorsNew);
    }
}
