package lambda_expression;

//lambda expression with multiple parameter
public class Example3 {
    public static void main(String[] args) {
        MathOperation mathOperation = (a, b) -> {
           int sum = a +b;
           return sum;
        } ;
        System.out.println("Sum :" +mathOperation.operation(5,5));
    }
}
