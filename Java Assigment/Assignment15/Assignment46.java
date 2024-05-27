package assignment;

import java.util.LinkedList;

//45. Write a Java program to check if a particular element exists in a linked list.
public class Assignment46 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        System.out.println(linkedList);

        int element = 3;
        boolean isElementPresent = linkedList.contains(element);

        if(isElementPresent) {
            System.out.println("Element "+element+" is present");
        } else {
            System.out.println("Element "+element+" Not Present");
        }
    }
}
