//develop a program that simulates a basic ATM mahine allowing users to
//perform action such as withdreaw, deposite, and check balance using switch-case,
#include<stdio.h>
#include<conio.h>
main(){
int balance=5000, amount, choice;
clrscr();
//printf(" Deposite Withdraw check Blance.\n");
printf("1.\nDeposite\n");
printf("2.Withdraw\n");
printf("3.Check Balance\n");
printf("Enter your choice(1-3):");
scanf("%d", &choice);
  switch(choice){
    case 1:    //deposite
      printf("Enter amount to deposite:");
      scanf("%d", &amount);
      balance = balance + amount;
      printf("%d amount creited",balance);
      break;

    case 2:  //withdraw
      printf("Enter amount to withdraw:");
      scanf("%d", &amount);
      if(balance-amount>500){
       balance = balance - amount;
       printf("%d amount debited");
      }
	else {
	  printf("withdraw not possible, maintai minimun balance");
	  break;

    case 3:  //balance check
      printf("%d balance amount", balance);
      break;

      default:
	printf("please enter option between 1-3");
      }
  }
getch();
}
