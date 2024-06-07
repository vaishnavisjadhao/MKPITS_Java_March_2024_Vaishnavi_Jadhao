package assignment_20;

import java.util.ArrayList;
import java.util.List;

//Calculate the product of all integers in a list.
public class Code15 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        int result = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }
}
