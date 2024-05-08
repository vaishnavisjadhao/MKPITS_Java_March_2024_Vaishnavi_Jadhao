//WAP that converts a given temperature from celsius to fahrenheit or vice
//versa based on user selection using switch-case.
#include<stdio.h>
#include<conio.h>
main(){
float a, b, celsius, fahrenheit;
int choice;
clrscr();
printf("enter 1  for convert fahrenheit to celsius");
printf("enter 2 for convert celsius to fahrnheit");
printf("Enter your choice:");
scanf("%d", &choice);
  switch(choice){
    case 1:
      printf("Enter the temperaturein fahrenheit");
      scanf("%f", &a);
      celsius = 5*(a-32)/9;
      printf("%f celsius temperatureis", celsius);
    case 2:
      printf("enter te tempreturein celsius");
      scanf("%f", &b);
      fhrenheit=((9*b)/5)+32;
      printf("%f fahrenheit temeratureis", fahrenheit);
      break;
	default:
	  printf("wrong choice try lateral");
	  break;
  }
 getch();
}