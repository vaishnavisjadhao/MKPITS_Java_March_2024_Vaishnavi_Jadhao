package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Create a list of strings and use a stream to filter out strings that start with the
// letter "A". Collect the filtered strings into a new list.
public class FilteringCollecting {
    public static void main(String[] args) {
        List <String> stringList = new ArrayList<>(){{
            add("Ajay");
            add("Bob");
            add("Champ");
            add("Aniket");
            add("Anil");
            add("Jon");
            add("Komal");
        }};

//        filter out strings that start with the letter "A"
        List <String> result = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(result);


    }
}
