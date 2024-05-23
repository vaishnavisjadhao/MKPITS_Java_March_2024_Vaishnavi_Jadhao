//print sum of first 10 numbers.
#include<stdio.h>
#include<conio.h>
main(){
 int i=0, s=0;
 clrscr();
 while(i<10) {
   s = s+i;
   i++; //i=i+1;
 }
 printf("sum=%d \n",s);
 getch() ;
}