package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Create a list of integers and use a stream to filter out the even numbers, double each remaining number,
// and then find the sum of the doubled numbers.
public class CombiningOperations {
    public static void main(String[] args) {
        //creating list of integer
        List<Integer> intList = new ArrayList<>(){{
            add(12);
            add(24);
            add(36);
            add(48);
            add(60);
            add(72);
            add(84);
        }};
        // Sum of even numbers
        int sumOfEvens = intList.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}
