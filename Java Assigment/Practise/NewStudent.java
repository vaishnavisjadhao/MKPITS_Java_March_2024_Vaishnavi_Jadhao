package stud;

import java.io.*;

public class NewStudent {

    public static void writeStudent(Student student) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Student readStudent() {
        Student student = null;
        try {
            //pass objectinputstream into  fileinputstrem
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));

            //cast in (Student) and store in student
            student = (Student) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return  student;
    }

    public static void main(String[] args) {
        //        wriet a data in file through object by ObjectOutputStream
        // Create a Student object
        Student student = new Student("abcd", 90);

        //--------------------------------wriet student information to file
//        NewStudent.writeStudent(student);



//        -------------------------------read data from file by ObjectInputStream
        NewStudent.readStudent();
        System.out.println(student.getName());
        System.out.println(student.getMarks());
    }


}
