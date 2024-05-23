//accept 10 numbers from user and display its sum.
#include<stdio.h>
#include<conio.h>
main(){
 int i=0, sum=0,num ;
 clrscr();
 while(i<10) {
  printf("Enter number: ");
  scanf("%d", &num);
   sum=sum+num;
   i++;
 }
 printf("sum =%d", sum);
 getch();
}
