package may23;

import java.util.HashSet;
import java.util.Set;

//Union and Intersection(common)
public class UnionIntersectExOFSet {
    public static void main(String[] args) {
        //create set using anonymous inner class
        Set<Integer> set = new HashSet<>(){{
            add(45);
            add(56);
            add(67);
            add(12);
        }};
        System.out.println(set);

        //Second Set
        Set<Integer> set1 = new HashSet<>(){{
            add(23);
            add(45);
            add(67);
            add(12);
        }};
        System.out.println(set1);

        //difference
        set.removeAll(set1);
        System.out.println("\nDifference: "+set);

        //add
        set.addAll(set1);
        System.out.println("\nUnion: "+ set);

        //Create Intersection Object to find intersection
        Set <Integer> intersect = new HashSet<>(set);
        intersect.retainAll(set1);
        System.out.println("\nintersection is: "+intersect);

    }
}
