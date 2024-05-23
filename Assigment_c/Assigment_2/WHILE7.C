//accept 10 numbers from user and count total number of
 //even and odd number entered.
 #include<stdio.h>
 #include<conio.h>
 main() {
 int i=0,num;
 int counteven=0, countodd=0;
 clrscr();
 printf("Enter ten number \n");
 while(i<10) {
   scanf("%d ", &num);
    if(num%2==0)
      counteven++;
      else
       countodd++;
    i++;
 }
 printf("Even number =%d \n", counteven);
 printf("Odd number =%d", countodd);
 getch();
 }