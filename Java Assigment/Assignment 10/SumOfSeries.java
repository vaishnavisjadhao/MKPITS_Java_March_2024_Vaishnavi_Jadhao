package Assignment2;
import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Variable to store the sum
        int sum = 0;

        // Loop to calculate the sum of squares
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        // Output the result
        System.out.println("The sum of the series is: " + sum);
        scanner.close();
    }
}

