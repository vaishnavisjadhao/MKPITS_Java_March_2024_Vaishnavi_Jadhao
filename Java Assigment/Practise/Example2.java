package lambda_expression;

//simple lambda expression
public class Example2 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = ()->
                System.out.println("Hello Lambda");
        myFunctionalInterface.myMethod();
    }
}
