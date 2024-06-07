package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Remove the first element from a list using streams.
public class Code16 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>() {{
            add("Blue");
            add("Black");
            add("White");
            add("Orange");
            add("Blue");
        }};
        List<String> result = colors.stream().skip(1).collect(Collectors.toList());
        System.out.println("After remove first element the list is: "+result);
    }
}
