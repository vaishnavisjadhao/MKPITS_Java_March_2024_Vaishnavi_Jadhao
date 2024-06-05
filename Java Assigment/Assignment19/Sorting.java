package stream_api;

import java.util.ArrayList;
import java.util.List;

//Create a list of strings and use a stream to sort them in ascending order.
public class Sorting {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(){{
            add("Ajay");
            add("Bob");
            add("Champ");
            add("Aniket");
            add("Anil");
            add("Jon");
            add("Komal");
        }};
        stringList.stream().sorted().forEach(System.out::println);
    }
}
