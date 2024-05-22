package stud;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
    private String name;
    private int marks;

//    parameterize constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    //get Methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    //comparable interface (compareTo)implemented by String, integer classes
    //comparable implement and override compare method (for sorting user defined classes)
    @Override
//    public  int compareTo(Object o){
//        //method of String
//        return name.compareTo(((Student)o).name);
//
////        OR
//        /*if(name.compareTo((Student)o).name==0)
//            return 0;
//        else if(name.compareTo((Student)o).name)>0)
//            return 1;
//        else
//            return -1;*/
//
//    }

    public int compareTo(Student st){
//        return new Integer(this.marks).compareTo(st.getMarks());

//        OR

        if (marks == (st).marks)
            return  0;
        else if (marks>st.marks)
            return  1;
        else
            return  -1;
    }

}

