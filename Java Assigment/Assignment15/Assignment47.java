package assignment;

import java.util.LinkedList;

//47. Write a Java program to check if a linked list is empty or not.
public class Assignment47 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        System.out.println(linkedList);

        boolean checkList = linkedList.isEmpty();
        if (checkList == true) {
            System.out.println("The List is empety");
        } else {
            System.out.println("The list is not empty");
        }
    }
}
