package lambda_expression;

//Lambda expression with parameter
//remove modifier, return type, method name . place arrow.
public class LambdaExpressionExample {
    public static void main(String[] args) {
        //implementing custom functional interface using lambda expression
        MyInterface myInterface = (int a, int b) -> {
            System.out.println(a+b);
        };
        //calling method calculate in MyInterface
        myInterface.calculate(5,5);
    }
}
