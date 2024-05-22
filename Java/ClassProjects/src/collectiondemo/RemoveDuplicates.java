package collectiondemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        Remove duplicates from set
        List<Integer> list = Arrays.asList(12, 43, 12, 56, 43);
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
