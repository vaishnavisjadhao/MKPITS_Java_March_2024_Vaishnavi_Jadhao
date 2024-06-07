package assignment_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Count the number of elements in a list.
public class Code7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        List listCount = Collections.singletonList(list.stream().count());
        System.out.println(listCount);
    }
}
