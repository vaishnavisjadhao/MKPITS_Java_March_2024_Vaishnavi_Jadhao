package assignment;

import java.util.ArrayList;

//16. Write a Java program to clone an array list to another array list.
public class Assignment16 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(){{
            add(11);
            add(21);
            add(31);
            add(41);
            add(51);
        }};
        System.out.println("List 1: "+list1);

        list1.clone();
        System.out.println("Clone ArrayList: " +list1);
    }
}
