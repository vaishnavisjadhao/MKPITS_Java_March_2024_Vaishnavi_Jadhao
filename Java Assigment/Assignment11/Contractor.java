package employee;

//2 Subclass Contractor extending Employee
public class Contractor extends  Employee{

    int workingHours;

//    constructor
    public Contractor(String name, double paymentPerHour, int workingHours){
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return paymentPerHour * workingHours;
    }
}
