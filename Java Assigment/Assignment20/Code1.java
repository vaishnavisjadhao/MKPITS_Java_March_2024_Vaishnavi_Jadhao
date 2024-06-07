package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Filter out even numbers from a list of integers.
public class Code1 {
    public static void main(String[] args) {
        List <Integer> list =new ArrayList<>(){{
            add(3);
            add(6);
            add(9);
            add(5);
            add(22);
            add(33);
            add(2);
            add(4);
        }};
        // Filter out even numbers using lambda expression
        List evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        //display even number
        for (Object o:evenNumbers) {
            System.out.println("Even Number: "+o);
        }
    }
}
