package assignment_20;

import java.util.ArrayList;
import java.util.List;

//Find the average of a list of integers.
public class Code8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        System.out.println(list.stream().mapToInt(Integer::intValue).average());

    }
}
