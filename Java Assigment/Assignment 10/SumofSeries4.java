package Assignment2;
import java.util.Scanner;

public class SumofSeries4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
//        This line reads an integer input from the user using the Scanner object scanner and stores it in the variable N.
        int N = scanner.nextInt();
//         This initializes a variable sum to store the sum of the series
        double sum = 0;
//      This loop iterates from 1 to N.
        for (int i = 1; i <= N; i++) {
//            Inside the loop, for each value of i, it calculates the reciprocal of the square of i and adds it to the variable sum.
            sum += 1.0 / (i * i);
        }

        System.out.println("Sum of the series 1/1 + 1/4 + 1/9 + ... + 1/N^2 = " + sum);
    }
}

