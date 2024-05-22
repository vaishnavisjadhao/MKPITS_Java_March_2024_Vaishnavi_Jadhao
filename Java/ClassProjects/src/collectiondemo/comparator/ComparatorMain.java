package collectiondemo.comparator;

import stud.Student;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>()
        {{
            add(new Student("Ram", 99));
            add(new Student("Shyam", 76));
            add(new Student("Geeta", 88));
            add(new Student("Chinu", 56));
        }};
        System.out.println("Compare By Name");
        Collections.sort(studentArrayList, new NameComparator());
        System.out.println(studentArrayList);

        System.out.println("Compare BY Marks");
        Collections.sort(studentArrayList, new MarksComparator());
        System.out.println(studentArrayList);

    }
}
