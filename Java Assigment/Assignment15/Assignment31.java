package assignment;

import java.util.LinkedList;

//31. Write a Java program to insert some elements at the specified position into a linked list.
public class Assignment31 {
    public static void main(String[] args) {
        LinkedList <String>  list = new LinkedList<>(){{
            add("LG");
            add("Sony");
            add("MI");
            add("Hp");
        }};
        System.out.println(list);

        list.add(2,"Dell");
        System.out.println("Dell insert st Second Position: " +list);
    }
}
