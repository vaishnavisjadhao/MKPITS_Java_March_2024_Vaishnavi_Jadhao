package Assignment2;
import java.util.Scanner;

public class SumofFactorialSeries2 {
    // Function to calculate factorial of a number
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

}

