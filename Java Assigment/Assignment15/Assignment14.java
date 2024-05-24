package assignment;

import java.util.ArrayList;
import java.util.Collections;

//14. Write a Java program that swaps two elements in an array list.
public class Assignment14 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>(){{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
        }};
        System.out.println(arrayList);


        Collections.swap(arrayList, 0, 4);
        System.out.println("Swap A with E: "+arrayList);
    }
}
