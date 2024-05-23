package employee;

//1. abstract class Employee
public abstract class Employee {
    String name;
    double paymentPerHour;

//    constructor
    public Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

//    Abstract method to calculate salary
    public abstract double calculateSalary();
}
