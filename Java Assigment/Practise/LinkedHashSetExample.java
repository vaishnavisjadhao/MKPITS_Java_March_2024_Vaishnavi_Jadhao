package may23;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(24);
        linkedHashSet.add(60);
        linkedHashSet.add(48);
        linkedHashSet.add(12);
        linkedHashSet.add(36);

        System.out.println(linkedHashSet);
        //Methods
        linkedHashSet.addFirst(12);
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.spliterator());

        System.out.println(linkedHashSet);

    }
}
