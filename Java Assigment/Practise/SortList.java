package collectiondemo;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        //Sort by collections clas
        List<Integer> list = Arrays.asList(12, 43, 12, 56, 43);
        System.out.println(list);

        //use sort() method from collections class to sort the list sort list
        Collections.sort(list);
        System.out.println(list);
    }
}

