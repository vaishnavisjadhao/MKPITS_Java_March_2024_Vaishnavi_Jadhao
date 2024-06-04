package assignment;

import java.util.HashMap;

public class StudentGradesManagement {
    HashMap <String, String> hashMap = new HashMap<>();

    //add student grade
    public void addGrade (String name, String grade) {
        hashMap.put(name, grade);
        System.out.println(hashMap.entrySet());
    }

    //update
    public void update(String name, String grade){
        hashMap.put(name, grade);
    }

    //delete
    public void deleteGrade(String name) {
        hashMap.remove(name);
    }

    //display by grade(value)
    public void display() {
        if(hashMap.isEmpty()){
            System.out.println("Grade are Not Available");
        }
        else {
            System.out.println("\nGrades");
            for (String grd : hashMap.values()) {
                System.out.println(grd);
            }
        }
    }

//    Main Method----------------------------------------------
public static void main(String[] args) {
        StudentGradesManagement studentGrades = new StudentGradesManagement();

        //add grades
    studentGrades.addGrade("Ram", "A");
    studentGrades.addGrade("Shyam", "B");
    studentGrades.addGrade("Gopal", "C");
    studentGrades.addGrade("Geeta", "D");

    //update
    studentGrades.update("Komal", "E");

    //delete
    studentGrades.deleteGrade("geeta");

    //Display
    studentGrades.display();
}
}
