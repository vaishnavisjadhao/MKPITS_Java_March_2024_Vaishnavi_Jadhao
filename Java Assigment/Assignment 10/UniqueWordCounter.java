package Assignment10;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordCounter {

    public static int countUniqueWords(String str) {
        // Split the input string into words
        String[] words = str.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();

        // Add each word to a set to automatically remove duplicates
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Return the size of the set, which represents the number of unique words
        return uniqueWords.size();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        scanner.close();

        int uniqueWordCount = countUniqueWords(input);
        System.out.println("Number of unique words: " + uniqueWordCount);
    }

}
