//WAF to aacept a number as an argument and check wheater it is prime or not
#include<stdio.h>
#include<conio.h>
 int checkPrime();
   int main() {
     checkPrime();
   }

 int checkPrime(){
   int num,i, count = 0;
   clrscr();
   printf("Enter Number: ");
   scanf("%d", &num);
   for(i=1; i<=num; i++){
     if(num%i==0){
       count++;
     }
   }
   if(count==2){
     printf("%d is Prime Number", num);
   } else{
     printf("%d is not prime Number", num);
     }
   getch();
   return 0;
 }