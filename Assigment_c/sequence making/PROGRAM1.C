//accept two number and display it sum
#include<stdio.h>
#include<conio.h>
main(){
int num1, num2, sum;   //declare variabl
clrscr();  //clear screen
printf("Enter Two Number");
scanf("%d %d", &num1, &num2); //read the two number from user
printf("%d", num1+num2);  //display sum
getch(); //hold screen
}