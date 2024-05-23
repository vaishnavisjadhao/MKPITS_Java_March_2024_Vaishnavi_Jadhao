package userinput;

import java.io.BufferedReader;
import java.io.FileReader;

public class StringOccurrenceCounter {
    public static void main(String[] args) {
        int count = 0;
        String fileNmae = "abc.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNmae));
            String str = bufferedReader.readLine();

            while (str != null) {
                str = bufferedReader.readLine();
                String words[] = str.split("");
                count = count + words.length;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("count occurance of word is: " +count);
    }
}
