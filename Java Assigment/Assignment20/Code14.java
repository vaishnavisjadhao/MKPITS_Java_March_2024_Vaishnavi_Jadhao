package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Partition a list of integers into even and odd.
public class Code14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
        }};
        // Filter out even numbers using lambda expression
//        List evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(list.stream().collect(Collectors.partitioningBy(n-> n % 2 == 0)));

    }
}
