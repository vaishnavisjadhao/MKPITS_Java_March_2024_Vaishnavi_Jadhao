package Assignment10;

import java.util.Scanner;

import static Assignment10.UniqueWordCounter.countUniqueWords;

public class RemoveAdjacentDuplicates {

    public static String removeAdjacentDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        // Iterate through each character in the string
        for (char c : chars) {
            // If the string is empty or the current character is different from the last character in the result string,
            // append it to the result string
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != c) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "ABBCCCD";
        String result = removeAdjacentDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);

    }



}

