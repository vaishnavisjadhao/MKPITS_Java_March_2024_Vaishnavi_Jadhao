package Assignment2;
import java.io.*;

// Java Program to Find Sum of the Series
// 1/1! + 2/2! + 3/3! + ……1/N!

public class SumofFactorialSeries {

        // Function(recursive) to calculate factorial
        public static double factorial(int i)
        {
            // Step1: Base case
            if (i == 1) {
                return 1;
            }
            // Step2&3: Recursion execution & call statements
            return i * factorial(i - 1);
        }

        // Function to calculate sum of series
        public static double calculateSum(int N)
        {
            // Store total_sum in sum
            double sum = 0;

            // Iteration by running a loop N times
            for (int i = 1; i <= N; i++) {
                sum = sum + ((double)i / factorial(i));
            }

            // Return calculated final sum
            return sum;
        }
}

