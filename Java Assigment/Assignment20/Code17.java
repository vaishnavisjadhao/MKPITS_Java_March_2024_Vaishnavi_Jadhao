package assignment_20;

import java.util.ArrayList;
import java.util.List;


//Find the second highest number in a list of integers.
public class Code17 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(){{
            add(3);
            add(6);
            add(9);
            add(5);
            add(22);
            add(33);
            add(2);
            add(4);
        }};
        // Find the second largest element in list
        Integer secondhighest = list.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1)
                .findFirst().orElse(null);

        System.out.println("Second highest integer in list: "+secondhighest);
    }
}
