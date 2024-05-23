//WAF to accept a number as an argument and return its factorial.
#include<stdio.h>
#include<conio.h>
 int numFactorial();
 int main(){
   numFactorial();
 }

 int numFactorial(){
   int i=1, num, fact=1;
   clrscr();
   printf("Enter a Number");
   scanf("%d", &num);
   while(i<=num){
     fact = fact * i;
     i++;
   }
   printf("Factorial Number of %d is: %d", num, fact);
   getch();
   return 0;
 }