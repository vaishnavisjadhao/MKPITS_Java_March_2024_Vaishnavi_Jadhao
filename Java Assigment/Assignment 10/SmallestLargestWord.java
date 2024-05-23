package Assignment10;

public class SmallestLargestWord {

    public static void main(String[] args) {
        String str = "Hello world, this is a sample string to analyze";
        String[] words = str.split("\\s+"); // Split the string into words

        // Initialize variables to store the largest and smallest words
        String smallestWord = words[0];
        String largestWord = words[0];

        // Iterate through each word in the array
        for (String word : words) {
            // Update smallest word if necessary
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
            // Update largest word if necessary
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        // Print the smallest and largest words
        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }
}

