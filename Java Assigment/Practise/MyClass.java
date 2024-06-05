package method;

public class MyClass {
    public static void main(String[] args) {
        //lambda expression
        MyInterface myInterface = (name) -> {
            System.out.println(name);
        };
        myInterface.display("Ram");

        //Method Reference
        NewClass newClass = new NewClass();
        MyInterface myInterface1 = newClass::displayDetails;
        myInterface1.display("Bob");
    }
}
