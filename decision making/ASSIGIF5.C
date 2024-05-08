//develop a program that check if a given number is perfect square using if statements
#include<stdio.h>
#include<conio.h>
#include<math.h>
main(){
int num, iVar; //iVar(incremant variable)
float fVar; //fVar(float variable)
clrscr();
printf("enter an integer number:");
scanf("%d", &num);
fVar=sqrt((double)num);
iVar=fVar;
if(iVar==fVar){
  printf("%d is a perfect square", num);
} else {
    printf("%d is not a perfect square", num);
}
getch();
}