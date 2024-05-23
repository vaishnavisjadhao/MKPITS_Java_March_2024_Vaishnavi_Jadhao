package assignment;

import java.util.ArrayList;

//6. Write a Java program to remove the third element from an array list.
public class Assigment6 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);

        System.out.println(arrayList);

        //remove third element with array
        arrayList.remove(3);
        System.out.println("\nAfter Remove Element: "+arrayList);
    }
}
