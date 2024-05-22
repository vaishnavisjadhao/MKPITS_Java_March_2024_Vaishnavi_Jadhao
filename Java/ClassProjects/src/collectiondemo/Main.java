package collectiondemo;

import stud.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
   //arraylist convert kary sathi type casting use kela =(ArrayList<Student>)
//        ArrayList <Student> studentArrayList = (ArrayList<Student>) Arrays.asList(new Student("Ram", 99),new Student("Shyam", 67));


        ArrayList <Student> studentArrayList = new ArrayList<>()
        {{
            add(new Student("Ram", 99));
            add(new Student("Shyam", 76));
            add(new Student("Geeta", 88));
            add(new Student("Chinu", 56));
        }};
        Collections.sort(studentArrayList);
//        Collections.sort(studentArrayList, new NameComparator);

        System.out.println(studentArrayList);
    }
}
