package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Find the sum of all numbers in a list.
public class Code3 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};

        //mapToInt convert stream to intStream object
        Integer sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
