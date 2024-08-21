package assignment;
import java.util.Scanner;
//Java Program to find if a number is prime or not. A number is said to be a prime number if it is divisible only by itself and unity.
//It should print all the prime number from 1 – 100;

public class Code6 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
