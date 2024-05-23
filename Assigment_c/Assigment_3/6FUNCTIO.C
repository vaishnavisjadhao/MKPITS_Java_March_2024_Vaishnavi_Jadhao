//WAF and accept a number as an argument and return its revers.
#include<stdio.h>
#include<conio.h>
 int reversNumber();
   int main(){
      reversNumber();
   }

 int reversNumber(){
   int i=1, revers, num;
   clrscr();
   printf("Enter a Number: ");
   scanf("%d", &num);
   while(num>0){
   revers = num % 10;
   printf("%d", revers);
   num = num /10;
   }
   getch();
   return 0;
 }