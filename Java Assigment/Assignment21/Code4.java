package assigment;

import java.util.Scanner;

//Write a Java Program to check whether a given year is a leap year or not
//the year is divisible by 4, it's a leap year also be divisible by 400
public class Code4 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year to check given year is leap year are not");
        year = scanner.nextInt();
        if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println(year +" is a leap year");
        } else {
            System.out.println(year +" is not a leap year");
        }

    }

}
