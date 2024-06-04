package assignment;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueIntegers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            LinkedHashSet <Integer> uniqueIntegers = new LinkedHashSet<>();

            System.out.println("Enter integers (type 'done' to finish):");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    uniqueIntegers.add(number);
                } else {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("done")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                    }
                }
            }

            scanner.close();

            System.out.println("Unique integers in the order they were entered:");
            for (int num : uniqueIntegers) {
                System.out.print(num + " ");
            }
        }
    }

