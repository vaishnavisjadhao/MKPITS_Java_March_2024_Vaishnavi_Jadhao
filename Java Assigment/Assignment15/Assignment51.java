package assignment;

import java.util.HashSet;
import java.util.LinkedList;

//51. Write a Java program to get the number of elements in a hash set.
public class Assignment51 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(){{
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
        }};
        System.out.println(set);

        //Print the Size of HashSe
        System.out.println("Size of Set: "+set.size());
    }
}
