package may24;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> num = new HashMap<>(){{
           put(1, 12);
           put(2, 24);
           put(3, 36);
           put(4, 48);
        }};
        System.out.println(num);

        System.out.println(num.remove(2));
        System.out.println(num);
        System.out.println(num.containsKey(3));

        num.put(null, null);
        System.out.println(num);

        System.out.println("\nhash Code: "+num.hashCode());
        System.out.println(""+num.keySet().hashCode());
        System.out.println(num.values().hashCode());


    }
}
