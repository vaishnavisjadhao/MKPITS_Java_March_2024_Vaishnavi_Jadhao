//create a program that simulates a basic ATM machine allowing users
// to withdraw, deposite, and check balance based on user input using if statements
#include<stdio.h>
#include<conio.h>
main(){
   int balance = 5000;
   int  amount, choice;
   clrscr();
   printf("1.deposite\n");
   printf("2.Withdraw\n");
   printf("3.check balance\n");
   printf("Enter your choice(1-3)\n");
   scanf("%d",&choice);

   if(choice==1){
     printf("Enter amount to deposite");
     balance = balance+amount;
     printf("%d amount debited", balance);
   }
   else if(choice == 2) {
     printf("Enter the withdraw amount:");
     balance = balance-amount;
     printf("%d amount debited");
   } else {
     printf("enter current chooice 1-3:");
   }
getch();
}