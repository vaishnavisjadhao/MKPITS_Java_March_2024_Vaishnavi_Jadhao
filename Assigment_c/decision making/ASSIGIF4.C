//WAP that determine the eligibility of a person for a discount
//base on their total purchase amount at a store using if statements.
#include<stdio.h>
#include<conio.h>
main(){
 float purchaseAmount, discount;
 clrscr();
 printf("enter your total purchase amount:");
 scanf("%f", &purchaseAmount);
 if(purchaseAmount >= 100){
   discount = 0.10;
 } else if(purchaseAmount >= 50){
    discount = 0.05;
 } else {
     discount = 0.00;
 }
 printf("your discount is %.2f%%\n", discount*100);
 getch();
}
