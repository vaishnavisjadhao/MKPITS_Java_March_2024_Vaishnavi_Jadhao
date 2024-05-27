package assignment;


import java.util.Iterator;
import java.util.LinkedList;

//33. Write a Java program to display elements and their positions in a linked list.
public class Assignment33 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(){{
            add(7);
            add(14);
            add(21);
            add(28);
        }};
        System.out.println(list);

        Iterator <Integer> it =list.iterator();
        while (it.hasNext()){
            System.out.println(list.indexOf(it.next()));
        }
    }
}
