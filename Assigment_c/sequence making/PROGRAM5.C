
//Accept the marks if it is greater than equal to 50 then display pass other wise fail
#include<stdio.h>
#include<conio.h>
main(){
int marks;
clrscr();
scanf("%d", &marks);
printf(marks>=50 ? "pass" : "fail");
getch();
}