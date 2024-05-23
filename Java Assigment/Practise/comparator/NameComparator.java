package collectiondemo.comparator;

import stud.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());

        if (o1.getName().compareTo(o2.getName())==0)
            return 0;
        else if(o1.getName().compareTo(o2.getName())>0)
            return 1;
        else
            return -1;
    }
}
