//Accept a number from user and dispay reverse.
#include<stdio.h>
#include<conio.h>
main() {
 int i=1,num,revers;
 clrscr();
 printf("Enter a number: ");
 scanf("%d", &num);

 while(num>0){  //if num greater than 0 then execute while loop
   revers=num%10;    //find remainder and print
   printf("%d", revers);
   num=num/10;
  // printf("%d", revers);
 //i=i+1;
 }
 getch();
}