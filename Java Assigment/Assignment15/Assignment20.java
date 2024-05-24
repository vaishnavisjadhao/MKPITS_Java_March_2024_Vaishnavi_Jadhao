package assignment;

import java.util.ArrayList;

//20. Write a Java program to increase an array list size.
public class Assignment20 {
    public static void main(String[] args) {
        ArrayList <String> city = new ArrayList<>(){{
           add("Nagpur");
           add("Pue");
           add("Wardha");
           add("Amravati");
           add("Chandrapur");
        }};
        System.out.println(city);

        city.ensureCapacity(50);
        System.out.println(city.size());
    }
}
