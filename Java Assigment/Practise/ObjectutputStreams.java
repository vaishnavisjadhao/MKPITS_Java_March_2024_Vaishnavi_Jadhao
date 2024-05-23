package stud;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectutputStreams {
    public static void main(String[] args) {
        String name, choice;
        int marks;
        try {
            //Write Data
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));

            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Enter Name:");
                name = scanner.next();

                System.out.println("Enter Marks:");
                marks = scanner.nextInt();

                //object of student
                Student student = new Student(name, marks);
                objectOutputStream.writeObject(student);

                System.out.println("Do you want to store another student info(Y/N)");
                choice = scanner.next();

            }
            while(choice.equalsIgnoreCase("Y"));
            objectOutputStream.close();

//             ------------------Read and display stored data---------------------------
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            System.out.println("stored information:");
            try {
                while (true) {
                    Student student = (Student) objectInputStream.readObject();
                    System.out.println("name: " + student.getName() + ", marks: " + student.getMarks());
                }
            } catch (Exception e) {

            }
            objectInputStream.close(); // Close the ObjectInputStream

        } catch (Exception e){
            System.out.println(e);
        }
    }

}
