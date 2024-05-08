//accept a number from user and display its factorial
#include<stdio.h>
#include<conio.h>
main(){
 int i=1, num, fact=1;
 clrscr();
 printf("Enter a number: ");
 scanf("%d", &num);
// i = 1;
 while(i<=num){
  fact=fact*i;
  i=i+1;   //i++
 }
 printf("factorial number of %d is: %d", num, fact);
 getch();
}