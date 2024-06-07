package assignment_20;

import java.util.ArrayList;
import java.util.List;

//Sort a list of strings alphabetically.
public class Code5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("Blue");
            add("White");
            add("Black");
            add("Orange");
            add("Pin");
        }};

        list.stream().sorted().forEach(System.out::println);
    }
}
