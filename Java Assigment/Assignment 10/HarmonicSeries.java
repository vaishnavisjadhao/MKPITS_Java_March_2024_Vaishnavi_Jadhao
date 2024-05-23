package Assignment2;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.print("Harmonic Series is: ");
        double sum = 0;
//        this loop iterates from 1 to N
        for (int i = 1; i <= N; i++) {
//             Inside the loop, for each value of i, it calculates the reciprocal of i and adds it to the variable sum.
            sum += 1.0 / i;
            System.out.print("1/" + i);
            if (i != N) {
                System.out.print(" + ");
            }
        }
        System.out.println("\nSum of Harmonic Series up to " + N + " terms is: " + sum);
    }
}


