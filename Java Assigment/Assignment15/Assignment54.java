package assignment;

import java.util.HashSet;

//54. Write a Java program to clone a hash set to another hash set.
public class Assignment54 {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>(){{
            add("Green");
            add("Pink");
            add("Red");
            add("Black");
        }};
        System.out.println(hashSet);

        HashSet <String> newSet = new HashSet<>();
        newSet = (HashSet)hashSet.clone();
        System.out.println("Clone HashSet: "+newSet);
    }
}
