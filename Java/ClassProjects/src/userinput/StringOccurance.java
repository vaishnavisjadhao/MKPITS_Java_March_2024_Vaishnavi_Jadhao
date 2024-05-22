package userinput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StringOccurance {


        public static void main(String[] args) {
            // Change the file path and the target string as per your requirement
            String filePath = "example.txt";
            String targetString = "yourString"; // The string you want to count

            int occurrenceCount = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;

                while ((line = br.readLine()) != null) {
                    occurrenceCount += countOccurrences(line, targetString);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("The string \"" + targetString + "\" occurs " + occurrenceCount + " times in the file.");
        }

        // Method to count occurrences of targetString in a single line
        private static int countOccurrences(String line, String targetString) {
            int count = 0;
            int index = 0;

            while ((index = line.indexOf(targetString, index)) != -1) {
                count++;
                index += targetString.length();
            }

            return count;
        }
    }

