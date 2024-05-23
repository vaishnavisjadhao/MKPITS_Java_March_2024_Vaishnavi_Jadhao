import java.util.Scanner;

import static Assignment2.SumofFactorialSeries.factorial;

public class FactorialMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += 1.0 / factorial(i);
        }

        System.out.println("Sum of the series 1/1! + 1/2! + 1/3! + ... + 1/N! = " + sum);
    }
}
