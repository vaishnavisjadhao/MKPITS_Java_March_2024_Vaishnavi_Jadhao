package stream_api;

import java.util.ArrayList;
import java.util.List;

//Create a list of integers and use a stream to double each integer in the list.
public class Mapping {
    public static void main(String[] args) {
        //creating list of integer
        List <Integer> intList = new ArrayList<>(){{
            add(12);
            add(24);
            add(36);
            add(48);
            add(60);
            add(72);
            add(84);
        }};
        intList.stream().map(n->n*2).forEach(n-> System.out.println(n));
    }
}
