package assignment;

import java.util.ArrayList;
import java.util.Collections;

//8. Write a Java program to sort a given array list.
public class Assigment8 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(20);
        arrayList.add(26);
        arrayList.add(2);
        arrayList.add(66);
        arrayList.add(12);
        System.out.println(arrayList);
        Collections.sort(arrayList);

        System.out.println("After Sorting:"+arrayList);
    }
}
