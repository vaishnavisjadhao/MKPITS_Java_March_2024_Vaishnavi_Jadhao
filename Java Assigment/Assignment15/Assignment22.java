package assignment;


import java.util.ArrayList;

//22. Write a Java program to print all the elements of an ArrayList using the elements' position.
public class Assignment22 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        //Add Colors in list
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        //print
        System.out.println(colors);
        for (Object o:colors) {
            System.out.println(o);
        }

    }
}
