package userinput;

import java.io.*;
import java.util.Scanner;
//Copy all data from one file to another file

public class CopyDataFromFile {
    public static void copyFile(String sourceFile, String destinationFile){
        //here create a file object
            try {
                //FileReader read the source file
                BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile));

                String str = bufferedReader.readLine();
//            loop for read all data from file
                while (str != null) {
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();//add new line charachter
                    str = bufferedReader.readLine();
                }
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }

    }

//    main method
    public static void main(String[] args) {

        CopyDataFromFile.copyFile("abc.txt", "xyz.txt");

        //user input for file path
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the file path");
//        String file = scanner.nextLine();
//        copyFile();
    }
}
