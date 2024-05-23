package userinput;

import java.io.*;

public class ClassBufferWriter {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name: ");
        try {
//            bufferWriter is gaerded by try and catch
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("new.txt"));

            String name = bufferedReader.readLine(); //because it show exception
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
