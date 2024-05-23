package assignment;

import java.util.ArrayList;

//5. Write a Java program to update an array element by the given element.
public class Assigment5 {
    public static void main(String[] args) {
        ArrayList <String> name = new ArrayList<>();

        name.add("Komal");
        name.add("Bob");
        name.add("Spring");
        name.add("Elements");
        //print
        System.out.println(name);

        //update 2 Element with Ram
        name.add(2,"Sonam");

        System.out.println("Updated List: "+name);
    }
}
