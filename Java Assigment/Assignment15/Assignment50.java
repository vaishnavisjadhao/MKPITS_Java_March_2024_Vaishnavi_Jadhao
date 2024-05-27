package assignment;

import java.util.HashSet;
import java.util.Iterator;

//50. Write a Java program to iterate through all elements in a hash list.
public class Assignment50 {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>(){{
            add("Ram");
            add("Tom");
            add("Shyam");
            add("Gopal");
            add("Geeta");
        }};
        System.out.println(hashSet);

        Iterator <String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
