package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Check if any string in the list contains the letter 'a'.
public class Code9 {
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>() {{
            add("Blue");
            add("Black");
            add("White");
            add("Orange");
            add("Blue");
            add("Aniket");
        }};
        List <String> result = colors.stream().filter((a) ->a.matches("a")).collect(Collectors.toList());
        System.out.println(result);

    }
}
