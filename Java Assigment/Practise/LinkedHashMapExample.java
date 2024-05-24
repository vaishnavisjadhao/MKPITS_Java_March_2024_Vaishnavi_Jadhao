package may24;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap<>(){{
            put(1,"A");
            put(2,"B");
            put(3,"C");
            put(4,"E");
        }};
        System.out.println(linkedHashMap);

        linkedHashMap.put(null, null);
        System.out.println(linkedHashMap);

        linkedHashMap.put(5, null);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.reversed());
        System.out.println(linkedHashMap.sequencedValues());


    }
}
