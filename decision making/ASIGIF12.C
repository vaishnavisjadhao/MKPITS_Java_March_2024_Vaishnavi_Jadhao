//develop a program that calculates the total number of days in a given monts based on te month
//number and year using switch-case
#include<stdio.h>
#include<conio.h>
main(){
int month, days;
clrscr();
printf("Enter mont:");
scanf("%d", &month);

 switch(month){
   case 1:           //case for 31 days
   case 3:
   case 5:
   case 7:
   case 8:
   case 10:
   case 12:
     printf("31 days");
     break;
   case 4:               //case for 30 days
   case 6:
   case 9:
   case 11:
     printf("30 days");
     break;
   case 2:
     printf("28 days");   //case for 28 or 29 days
     break;
     default:
       printf("Invali Month");
       break;
 }
getch();
}