package assignment;

import java.util.HashSet;

//52. Write a Java program to empty an hash set.
public class Assignment52 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

        set.removeAll(set);
        System.out.println(set);
    }
}
