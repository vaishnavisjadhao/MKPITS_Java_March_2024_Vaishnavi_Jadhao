package assignment;

import java.util.Scanner;
import java.util.TreeSet;

public class SortedUniqueElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet <Integer> treeSet = new TreeSet<>();
        System.out.println("Enter List of Integers");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                treeSet.add(number);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    System.out.println("please Enter an integer or stop to finish");
                }
            }
        }
        scanner.close();;

        System.out.println("Sorted Order");
        for (int num: treeSet) {
            System.out.println(num + "");
        }
    }
}
