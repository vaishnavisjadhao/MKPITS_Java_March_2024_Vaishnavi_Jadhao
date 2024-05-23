package assignment;

import java.util.ArrayList;

//3. Write a Java program to insert an element into the array list at the first position.
public class Assigment3 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();

        //Add
        arrayList.add("Ram");
        arrayList.add("Shyam");
        arrayList.add("Gopal");
        arrayList.add("Mohit");

        //insert at first position
        arrayList.add(0,"Bob");

        //Display
        for (int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
