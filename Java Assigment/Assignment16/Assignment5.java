package assignment.vector;

import java.util.Vector;

public class Assignment5 {
    private String name;
    private int age;

    public Assignment5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Assignment5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    -----------------------------------------------
     public static void main(String[] args) {
        Vector vector = new Vector<>();
         vector.add(new Assignment5("Ram", 20));
         vector.add(new Assignment5("Shyam", 23));
         vector.add(new Assignment5("Geeta", 34));
     }
}
