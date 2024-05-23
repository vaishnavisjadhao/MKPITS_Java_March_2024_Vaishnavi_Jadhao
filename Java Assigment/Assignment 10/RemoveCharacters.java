package Assignment10;

import java.util.Scanner;
//1..
public class RemoveCharacters {

     public static String removeCharacters(String input, String mask) {
         StringBuilder result = new StringBuilder();

         // Create a boolean array to indicate characters to be removed
         boolean[] removeChars = new boolean[256]; // Assuming ASCII characters

         // Mark characters in mask string
         for (int i = 0; i < mask.length(); i++) {
             removeChars[mask.charAt(i)] = true;
         }

         // Append characters not in mask to result string
         for (int i = 0; i < input.length(); i++) {
             char ch = input.charAt(i);
             if (!removeChars[ch]) {
                    result.append(ch);
             }
         }
         return result.toString();
     }

    // Main method to execute the program.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        // Mask string
        System.out.print("Enter Mask String: ");
        String mask = scanner.nextLine();

        // Remove characters from input string based on mask string
        String result = removeCharacters(input, mask);

        // Output result
        System.out.println("Output: " + result);

        scanner.close();


    }
 }
