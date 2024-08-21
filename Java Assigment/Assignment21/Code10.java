package assigment;

// * Java program to convert days to years weeks and days.

import java.util.Scanner;

public class Code10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of days");
        int days = scanner.nextInt();

        int years = (days/365);
        int moths = (days%365)/7;
//            days = (days%365)%7;

        System.out.println("years ="+years);
        System.out.println("moths ="+moths);
        System.out.println("days ="+days );
    }
}