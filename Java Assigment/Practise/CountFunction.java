package userinput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountFunction {
    public static void main(String[] args) {
        //store the path of the file in String
        String fileName = "abc.txt";
        //initilaize three variables(for count the no of words, char, line from file)
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            //here read the file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String str = bufferedReader.readLine();

            //start loop for read each line of the file
            while (str!=null){
                str = bufferedReader.readLine();
                 lineCount ++; //increament the line count for rad each line

                //The split() method splits a string into an array of substrings
                String[] words = str.split("\\s+");
                wordCount = wordCount + words.length;

                //find length of charachetr (length method)
                charCount = charCount + str.length();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Total line : "+lineCount);
        System.out.println("Total charachter is: " +charCount);
        System.out.println("Total Word:" +wordCount);
    }
}
