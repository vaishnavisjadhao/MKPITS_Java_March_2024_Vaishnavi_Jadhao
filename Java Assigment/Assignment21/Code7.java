//Program 7 :. Write a Java Program to Find Sum of the Series
// 1/1! + 2/2! + 3/3! + ……1/N!
package assigment;

import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();
        double sum = 0.0;

        for(int i=0; i<=num; i++){
            long factorial = 1;
            for(int j=1; j<=i; j++){
                factorial = factorial *j;
            }
            sum += (1.0/factorial);
        }
        System.out.println("Sum=" + sum);
    }
}