package userinput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
//Read all data from file

public class ReadFileFromUser {
    public static void readFromFile(String file) {
//        if(file.exists()) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
//            loop for read all data from file
            while (str != null) {
                System.out.println(str);
                str = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
//        }
//        else {
//            System.out.println("File Not Found");
//        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a path of file");
        String file = scanner.nextLine();
        readFromFile(file);
    }
}
