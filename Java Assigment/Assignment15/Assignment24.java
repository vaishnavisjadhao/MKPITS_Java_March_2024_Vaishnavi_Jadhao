package assignment;

import java.util.Iterator;
import java.util.LinkedList;

//24. Write a Java program to iterate through all elements in a linked list.
public class Assignment24 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        list.add("Laptop");
        list.add("TV");
        list.add("Mobile");
        list.add("Ipad");
        list.add("Watch");
        System.out.println(list);

        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
