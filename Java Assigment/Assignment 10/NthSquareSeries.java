package Assignment2;

import java.util.Scanner;

public class NthSquareSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Sum of the series 1^2 + 2^2 + 3^2 + ... + n^2 = " + sum);
    }
}

