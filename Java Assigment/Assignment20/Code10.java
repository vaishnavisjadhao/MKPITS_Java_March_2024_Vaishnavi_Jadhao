package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Concatenate all strings in the list, separated by commas.
public class Code10 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>(){{
            add("Gopal");
            add("Ram");
            add("Shyam");
            add("Monit");
            add("Aniket");
            add("Bob");
        }};

//        List <String> result = list.stream().filter(a-> a.concat()).distinct().collect(Collectors.toList());
//        System.out.println(result);
    }
}
