package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

//56. Write a Java program to convert a hash set to a tree set.
public class Assignment56 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Hashset: "+set);

        //convert hashset to tree set
        TreeSet <Integer> treeSet =new TreeSet<>(set);
        System.out.println("TreeSet: "+treeSet);
    }
}
