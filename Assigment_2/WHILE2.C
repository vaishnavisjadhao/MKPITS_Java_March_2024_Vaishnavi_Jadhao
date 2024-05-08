//print first 10 even nmbers.
#include<stdio.h>
#include<conio.h>
main() {
  int i = 0;
  clrscr();
  while (i<20) {
    printf("%d \n", i);
    i=i+2; //i=i+1
  }
  getch();
}