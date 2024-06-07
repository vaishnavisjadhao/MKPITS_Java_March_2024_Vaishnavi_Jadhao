package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Group a list of strings by their length.
public class Code13 {
    public static void main(String[] args){
        List <String> list = new ArrayList<>(){{
            add("length");
            add("height");
            add("weight");
            add("long");
        }};
//        list.stream().collect(Collectors.groupingBy(String::length);
    }
}
