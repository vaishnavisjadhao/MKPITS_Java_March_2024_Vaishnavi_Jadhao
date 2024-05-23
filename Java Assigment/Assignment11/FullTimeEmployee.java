package employee;

//3. Subclass FullTimeEmployee extending Employee
public class FullTimeEmployee extends Employee{
    int workingHours;

//    constructor
    public  FullTimeEmployee(String name, double paymentPerHour, int workingHours){
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return paymentPerHour * workingHours * 40;
    }
}
