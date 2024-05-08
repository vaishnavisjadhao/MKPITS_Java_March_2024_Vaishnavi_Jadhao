//WAP that determines the day of the week based on the given number(1 for
//sunday, 2 for monday, etc)using switch-case.
#include<stdio.h>
#include<conio.h>
main(){
int week;
clrscr();
printf("Enter week number");
scanf("%d" ,&week);
 switch(week){
   case 1:
     printf("Monday");
     break;
   case 2:
     printf("Tuesday");
     break;
   case 3:
     printf("wednesday");
     break;
   case 4:
     printf("Thursday");
     break;
   case 5:
     printf("Friday");
     break;
   case 6:
     printf("Saturday");
     break;
   case 7:
     printf("Sunday");
     break;
     default:
       printf("Invalid Week number");
       break;
 }
getch();
}