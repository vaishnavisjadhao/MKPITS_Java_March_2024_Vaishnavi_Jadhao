package assignment_20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Find the maximum number in a list of integers.
public class Code2 {
    public static void main(String[] args) {
        // Creating a list of integers
        List <Integer> list = new ArrayList<>();
        list.add(7);
        list.add(14);
        list.add(21);
        list.add(5);
        list.add(6);
        list.add(16);
        list.add(18);
        //using stream().max to get maximum number
        Integer result = list.stream().max(Integer::compare).get();
        System.out.println("Maximum Number in list: "+result);
    }
}
