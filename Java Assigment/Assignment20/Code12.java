package assignment_20;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Find the longest String in  the list
public class Code12 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>() {{
            add("Nagpur");
            add("Wardha");
            add("Chandrapur");
            add("Pune");
            add("Latur");
        }};
        //length of longest stream
        int longString = list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(longString);
    }
}
