package stream_api;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Create a list of objects (e.g., custom objects with attributes like name and age) and use a
// stream to find the oldest and youngest objects based on a certain attribute (e.g., age).
public class FindingMaxAndMin {
    public static void main(String[] args) {
        //adding object of employee in array list
        List <Employee> employeeList = new ArrayList<>(){{
            add(new Employee("Ram", 23));
            add(new Employee("Gopal", 33));
            add(new Employee("Shyam", 25));
            add(new Employee("Geeta", 19));
            add(new Employee("Bob", 28));
        }};

        //stream to find the youngest
        Optional<Employee> e_min=employeeList.stream().min(Comparator.comparingInt(Employee::getAge));
        System.out.println(e_min);

        //stream to find the oldest
        Optional<Employee> e_max=employeeList.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println(e_max);

