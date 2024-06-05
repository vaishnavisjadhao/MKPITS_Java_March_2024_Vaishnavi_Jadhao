package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Create a list of strings and use a stream to group them by their length, and then count the
// number of strings in each group.
public class GroupingAndCounting {
    public static void main(String[] args) {
        //creating list of stream
        List<String> list = new ArrayList<>(){{
            add("Ajay");
            add("Bob");
            add("Champ");
            add("Anil");
            add("Jon");
            add("Tom");
        }};

        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingByConcurrent(String::length, Collectors.counting()));

        System.out.println(result);
    }
}
