package assignment;
import java.util.LinkedList;
import java.util.Iterator;

//25. Write a Java program to iterate through all elements in a linked list starting at
// the specified position.
public class Assignment25 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        list.add("Pen");
        list.add("pencil");
        list.add("Book");
        list.add("Paper");
        list.add("chock");

        System.out.println(list);

        //display linkedlist starting from 2 position
        System.out.println("\nLinked list is display from 2 position");
        Iterator <String> iterator = list.listIterator(2);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
