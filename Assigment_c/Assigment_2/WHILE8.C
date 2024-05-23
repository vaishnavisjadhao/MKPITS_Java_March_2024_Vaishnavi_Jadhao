//Accept 10 number from user and display greatest  if(n>g) g=n
#include<stdio.h>
#include<conio.h>
main(){
int i=0, num, greatest=0;
clrscr();
printf("Enter 10 numbers:\n");
while(i<10) {
 scanf("%d", &num);
if(num > greatest){
  greatest=num;
}
 i++;
}
printf("the greatest number is %d\n",greatest);
getch() ;
}