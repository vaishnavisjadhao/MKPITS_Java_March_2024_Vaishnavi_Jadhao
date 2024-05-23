package arraylists.sms;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private int student_id;
    private String student_name;
    private String student_grade;

    //constructor
    public Student(int student_id, String student_name, String student_grade) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_grade = student_grade;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getStudent_grade() {
        return student_grade;
    }

    @Override
    public String toString() {
        return "id:" + student_id + " Name:"+student_name+ " Grade:"+student_grade ;
    }


    //This Method is use to sort arraylist
    @Override
    public int compareTo(Student st) {
        return student_grade.compareTo((st).student_grade);
    }
}
