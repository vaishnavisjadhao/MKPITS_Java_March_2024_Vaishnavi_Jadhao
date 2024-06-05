package stream_api;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(){{
           add(1);
           add(2);
           add(3);
           add(4);
        }};
        Set square = arrayList.stream().map(n-> n*n).collect(Collectors.toSet());
        System.out.println(square);

        arrayList.stream().map(n-> n*n).forEach(x-> System.out.println(x));
    }
}
