//develop a program that calculate the root of a quadratic equation
//ax^2+bx+c=0 using if statements
#include<stdio.h>
#include<conio.h>
main(){
int num1, num2;
printf("enter two numbers");
scanf("%d %d", &num1, &num2);
if(num1 > num2) {
  printf("%d is greater", num1);
} else {
    printf("%d is greater", num2);
}
getch() ;
}