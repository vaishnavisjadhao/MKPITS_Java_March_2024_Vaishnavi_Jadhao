package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Convert a list of strings to uppercase.
public class Code4 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>(){{
            add("Blue");
            add("White");
            add("Black");
            add("Orange");
            add("Pin");
        }};
        //Convert String to uppercase
        List <String> stream = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stream);
    }
}
