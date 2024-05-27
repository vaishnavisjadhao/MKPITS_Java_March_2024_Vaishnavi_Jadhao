package assignment;

import java.util.HashSet;

//55. Write a Java program to convert a hash set to an array.
public class Assignment55 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

        String arr[] = new String[set.size()];
        set.toArray(arr);

        for (String elment : arr){
            System.out.println(elment);
        }
    }
}
