//WAF to accept a number as an argument check whether it is armstrong or not.
#include<stdio.h>
#include<conio.h>
  int checkArmstrong();
    int main(){
       checkArmstrong();
    }

  int checkArmstrong(){
    int num, originalno, r, sum;
    clrscr();
    printf("Enter a Number: ");
    scanf("%d", &num);
    originalno = num;
    while(num>0){
      r = num % 10;
      sum = sum+(r*r*r);
      num = num /10;
    }
    if(sum==originalno) {
      printf("%d is Armstrong Number", originalno);
    } else {
       printf("%d is Not Armstrong Number", originalno);
    }
    getch();
    return 0;
  }
