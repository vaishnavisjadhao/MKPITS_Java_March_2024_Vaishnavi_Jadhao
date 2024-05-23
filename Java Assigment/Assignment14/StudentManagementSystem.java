package arraylists.sms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagementSystem {
    static ArrayList <Student> students = new ArrayList<>();

    //Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    //Remove Student
    public void removeStudent(int student_id) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getStudent_id() == student_id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student removed: " + studentToRemove);
        } else {
            System.out.println("Student with ID " + student_id + " not found.");
        }
    }

    //Search Student By Id
    public void searchStudentById(int student_id) {
        for (Student student : students) {
            if (student.getStudent_id() == student_id) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + student_id + " not found.");
    }

    //Sort By Grade
    public void studentSortedByGrade() {
        Collections.sort(students);
        System.out.println(students);
    }

    //Display all SStudent
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("All students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }


    //Main Method---------------------------------------------------------------------------
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        String choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter Student Id: ");
            int student_id = scanner.nextInt();
            System.out.println("Enter Name of Student: ");
            String student_name = scanner.next();
            System.out.println("Enter Grade of Student: ");
            String student_grade = scanner.next();

            sms.addStudent(new Student(student_id, student_name, student_grade));
            System.out.println("Do you want to store another student info(Y/N)");
            choice = scanner.next();
        }
        while (choice.equalsIgnoreCase("Y"));


        //Search Student With ID of Student
        System.out.println("\nEnter Id  to search student");
        int student_id = scanner.nextInt();
        sms.searchStudentById(student_id);

        //Sorted by Grade
        System.out.println("\nDisplaying all students sorted by grade:");
        sms.studentSortedByGrade();

        //Removing Student with ID
        System.out.println("Enter Student Id to Remove Student");
        sms.removeStudent(student_id);

        //Display All Student
        System.out.println("\nDisplaying all students:");
        sms.displayAllStudents();
    }

}
