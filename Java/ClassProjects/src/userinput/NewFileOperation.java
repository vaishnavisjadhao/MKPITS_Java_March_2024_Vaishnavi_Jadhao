package userinput;
import java.io.*;

//Enter(wriet) data in file

public class NewFileOperation {
//    Method
    public static void writeMoreFile() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //
        BufferedWriter bufferedWriter;

        try {
            String name, choice;
            bufferedWriter = new BufferedWriter(new FileWriter("abc.txt", true));
            do {
                System.out.println("Enter Name: ");
                name = bufferedReader.readLine();
                bufferedWriter.write(name+"\n");
                System.out.println("Do You Want To Enter Again (Y/N)");
                choice = bufferedReader.readLine();
            }
//            while (choice == 'y' || choice == "Y");
            while (choice.equalsIgnoreCase("Y"));
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

//Method for read dat from file
   public static void readFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
            String str = bufferedReader.readLine();
//            loop for read all data from file
            while(str != null) {
                System.out.println(str);
                str = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }


//    run on main
    public static void main(String[] args) {
        NewFileOperation.writeMoreFile();
        NewFileOperation.readFromFile();
    }


 }
