package assignment;

import java.util.ArrayList;

//9. Write a Java program to copy one array list into another.
public class Assigment9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(10);
            arrayList.add(20);
            arrayList.add(30);
            arrayList.add(40);
            arrayList.add(50);

        System.out.println(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);
        arrayList1.containsAll(arrayList);
        System.out.println("\nCopied List: "+arrayList1);
    }
 }
