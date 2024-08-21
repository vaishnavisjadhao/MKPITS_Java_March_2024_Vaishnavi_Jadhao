package assigment;

import java.util.Scanner;

//Write a Java program to convert Integer value into Binary
public class Code11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer value to convert in Binary");
        int number = scanner.nextInt();

        System.out.println("Binary:" +Integer.toBinaryString(number));
    }
}
