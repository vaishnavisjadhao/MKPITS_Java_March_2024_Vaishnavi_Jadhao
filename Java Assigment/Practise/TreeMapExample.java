package may24;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap <Integer, String> treeMap = new TreeMap<>(){{
            put(1, "Apple");
            put(2, "Mango");
            put(3, "Orange");
        }};
        System.out.println(treeMap);

        System.out.println(treeMap.hashCode());
    }
}
