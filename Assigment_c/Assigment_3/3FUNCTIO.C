//accept 2 number as an argument display greatest.
#include<stdio.h>
#include<conio.h>
int display_greatest();
   int  main(){
     display_greatest();
   }
 int display_greatest(int num1, int num2){
 clrscr();
 printf("Enter Two Numbers: ");
 scanf("%d %d", &num1, &num2);
 if(num1>=num2){
   printf("%d", num1);
 } else {
   printf("%d", num2);
 }
// printf("%d", r);
 getch();
 return 0;
 }