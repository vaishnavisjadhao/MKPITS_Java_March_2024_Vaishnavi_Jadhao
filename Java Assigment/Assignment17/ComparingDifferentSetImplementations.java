package assignment;

import javax.swing.text.Element;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ComparingDifferentSetImplementations {
    public static void main(String[] args) {
        //insertion of elements and insertion of time
        long hashSetStart = System.nanoTime();
        HashSet <Integer> hashSet = new HashSet<>(){{
            add(10);
            add(20);
            add(30);
            add(40);
            add(20);
            add(30);
        }};
        long hashSetEnd = System.nanoTime();
        long hashSetInsertionTime = hashSetStart - hashSetEnd;
        System.out.println("time taken to insertion in hashset "+hashSetInsertionTime+" nanotime");

        long linkedHashSetStart = System.nanoTime();
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(4);
            add(3);
        }};
        long linkedHashSetEnd = System.nanoTime();
        long linkedHashSetInsertionTime = linkedHashSetStart - linkedHashSetEnd;
        System.out.println("time taken to insertion in hashset "+linkedHashSetInsertionTime+" nanotime");


        long treeSetStart = System.nanoTime();
        TreeSet <Integer> treeSet = new TreeSet<>(){{
           add(50);
           add(60);
           add(60);
           add(70);
           add(80);
        }};
        long treeSetEnd = System.nanoTime();
        long treeSetInsertionTime = treeSetStart - treeSetEnd;
        System.out.println("time taken to insertion in hashset "+treeSetInsertionTime+" nanotime");

        //Display all Sets
        System.out.println("Element of HashSet 10,20,30,40,20,30");
        System.out.println("HashSet: "+hashSet);

        System.out.println("\nElement of LinkedHashSet 1,2,3,4,4,3");
        System.out.println("LinkedHashSet: "+linkedHashSet);

        System.out.println("\nElement of TreeSet 50,60,60,70,80");
        System.out.println("TreeSet: "+treeSet);
    }
}
