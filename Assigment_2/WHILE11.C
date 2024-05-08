//accept a number and check whether it is armsstrong no or not
#include<stdio.h>
#include<conio.h>
main(){
 int num,originalno, r, sum=0;
 clrscr();
 printf("Enter number");
 scanf("%d", &num);
 originalno = num;
 while(num>0) {
  r=num%10;
  sum=sum+(r*r*r);
  num=num/10;
 }
 if(sum==originalno){
   printf("%d is a armstrong number", originalno);
 } else {
   printf("%d is not a armstrong number", originalno);
 }
// printf("%d", sum);
 getch();
}