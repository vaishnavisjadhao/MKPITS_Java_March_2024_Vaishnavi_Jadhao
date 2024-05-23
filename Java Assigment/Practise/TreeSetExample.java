package may23;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet <Integer> treeSet = new TreeSet<>();

        treeSet.add(24);
        treeSet.add(36);
        treeSet.add(12);
        treeSet.add(60);
        treeSet.add(48);

        System.out.println(treeSet);

        treeSet.add(26);
        System.out.println(treeSet);
    }
}
