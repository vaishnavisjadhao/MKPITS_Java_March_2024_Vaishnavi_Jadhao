package userinput;

import java.io.*;

public class FileOperation {

//    Meythod
    public static void writeToFile() {
//        BufferedReader is use to read the data from user(input from user)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Name");

        try {
            String name = bufferedReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("xyz.txt"));
            bufferedWriter.write(name+"\n");
            bufferedWriter.close();
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        FileOperation.writeToFile();
    }

}
