//accept length and birth of rectangle and display its area
#include<stdio.h>
#include<conio.h>
main() {
int length, breadth, area;
clrscr();
printf("enter length of rectangle");
scanf("%d", &length);
printf("enter breadth of rectangle");
scanf("%d", &breadth);
printf("%d", length*breadth);
getch();
}