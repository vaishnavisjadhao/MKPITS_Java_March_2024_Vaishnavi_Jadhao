package assignment;

import java.util.ArrayList;

//7. Write a Java program to search for an element in an array list.
public class Assigment7 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(24);
        arrayList.add(36);
        arrayList.add(48);
        arrayList.add(60);
        arrayList.add(72);

        System.out.println(arrayList);

        //Search Element(72) in array list
        if(arrayList.contains(72)){
            System.out.println("72 is Found in List");
        } else {
            System.out.println("Not Found");
        }

    }
}
