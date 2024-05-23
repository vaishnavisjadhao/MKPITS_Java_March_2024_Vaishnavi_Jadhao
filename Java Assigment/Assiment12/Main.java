package employyeManagmentSytem;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee() {
            private String name = "ALise Doe";
            private double salary = 50000;

            @Override
            public double calculateSalary() {
                return salary;
            }

            @Override
            public void displayDetails() {
                System.out.println("Name: " +name);
                System.out.println("Type: fullTimeEmployee");
                System.out.println("Salary: " +salary);
            }
        };

        fullTimeEmployee.displayDetails();
    }
}
