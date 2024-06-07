package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

//Get a list of unique numbers from a list with duplicates.
public class Code6 {
    public static void main(String[] args) {
        // Creating a list of integers
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Apple");

        List<String> uniquelist = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniquelist);
    }
}
