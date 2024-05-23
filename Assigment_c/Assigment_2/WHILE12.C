//Accept a number check whether it is prime or not
#include<stdio.h>
#include<conio.h>
main() {
  int i=1,num, count=0;
  clrscr();
  printf("Enter a number:");
  scanf("%d",&num);
  while(i<=num){
    if(num%i==0){
     count = count + 1;
    }
  }
  if(count==2) {
   printf("%d Prime Number", num);
  } else {
      printf("%d Not Prime Number", num);
  }
  getch();
}
