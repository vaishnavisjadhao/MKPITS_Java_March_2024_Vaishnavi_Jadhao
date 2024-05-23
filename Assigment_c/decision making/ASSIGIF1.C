//develop a program that categorizes a given angle as acute, right,
// obtude, or straight based on its measure uing if statement
#include<stdio.h>
#include<conio.h>
void main(){
int side1, side2, side3;
clrscr();
printf("Enter the length of three side of traingl:\n");
scanf("%d %d %d", &side1, &side2, &side3);
if(side1==side2 && side2==side3){
  printf("it is equilateral traingle.\n");
} else if(side1==side2 || side2==side3 || side3==side1) {
    printf("it is a isoscale traingle.\n");
} else {
    printf("it is a scalen traingle.\n");
}
getch();
}