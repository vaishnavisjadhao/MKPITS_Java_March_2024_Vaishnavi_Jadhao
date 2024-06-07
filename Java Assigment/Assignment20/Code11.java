package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Filter out strings with length less than 5
public class Code11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {{
            add("Tom");
            add("Aniket");
            add("Vishnavi");
            add("Jerry");
            add("jon");
            add("orange");
        }};
        List result = list.stream().filter(a -> a.length() <= 5).collect(Collectors.toList());
        System.out.println(result);
    }
}
