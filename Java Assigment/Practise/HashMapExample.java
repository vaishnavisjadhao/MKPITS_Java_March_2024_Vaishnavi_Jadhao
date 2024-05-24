package may24;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> cities = new HashMap<>();
        cities.put("Wardha", 32);
        cities.put("Nagpur", 31);
        cities.put("Pune", 14);

        System.out.println(cities);

        //keySet() methods returns only Keys
        System.out.println("\nKeys"+cities.keySet());
        //display keySet by for each loop
        for (String key:cities.keySet()) {
            System.out.println(key);
        }

//        values() return values
        System.out.println("\nvalues"+cities.values());
        for(Integer val:cities.values()){
            System.out.println(val);
        }

        //Display Set of Key And Values
        System.out.println("\nset of key and values"+cities.entrySet());


    }
}
