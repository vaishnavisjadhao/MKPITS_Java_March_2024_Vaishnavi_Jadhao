package assignment;

import java.util.HashSet;

//53. Write a Java program to test if a hash set is empty or not.
public class Assignment53 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

       if (set.isEmpty()){
           System.out.println("HashSet is empty");
       } else {
           System.out.println("HashSet is not empty");
       }
    }
}
