package assigment;

import java.util.Scanner;
//Java Program to Find the Sum of n Square Numbers.
//sum = n*(n+1)*(2n+1)/6
public class Code5 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to print sum of number");
        num = scanner.nextInt();
        int sum = (num*(num+1) * (2*num+1))/6;
        System.out.println(sum+"Square of number");
    }
//    public static int sumSquar(int n){
//        return   (n * (n + 1) * (2 * n + 1)) / 6;
//    }
//
//    public static void main(String[] args) {
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any number to find the sum of square");
//        n = scanner.nextInt();
//        System.out.println(sumSquar(n));
//    }
}

