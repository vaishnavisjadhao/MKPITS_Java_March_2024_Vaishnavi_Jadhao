package assignment;

import java.util.HashSet;

//49. Write a Java program to append the specified element to the end of a hash set.
public class Assignment49 {
    public static void main(String[] args) {
        //create hashset
        HashSet hashSet = new HashSet();

        //Use add method to add value in the hashset
        hashSet.add("Ram");
        hashSet.add("Shyam");
        hashSet.add("Gopal");
        hashSet.add("Vijay");

        //print the hashset
        System.out.println(hashSet);
    }
}
