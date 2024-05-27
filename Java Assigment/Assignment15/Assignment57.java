package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//57. Write a Java program to find numbers less than 7 in a tree set.
public class Assignment57 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);

        System.out.println("Hashset: "+set);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet = (TreeSet)set.headSet(7);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
