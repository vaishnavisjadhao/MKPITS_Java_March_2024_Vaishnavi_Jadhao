//accept radius of circle display its area
#include<stdio.h>
#include<conio.h>
main() {
float pi=3.14, radius, area;
clrscr();
printf("enter the radius of cirlce:");
scanf("%f", &radius);
area=pi*radius*radius;
printf("the area of circle:%f", area);
getch();
 }
