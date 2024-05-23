//WAF and accept a 3 number display its greatest.
#include<stdio.h>
#include<conio.h>
 int checkGreatest();
   int main(){
     checkGreatest();
 }

  int checkGreatest(int num1, int num2, int num3){
   // int num1, num2, num3;
    clrscr();
    printf("Enter Three Numbers: ");
    scanf("%d %d  %d", &num1, &num2, &num3);
    if(num1>=num2 && num1>= num3){
      printf("Greatest Number is: %d", num1);
    } else if(num2>=num3 && num2>=num1){
	printf("Greatest Number is: %d", num2);
      } else {
	  printf("Greatest Number is: %d", num3);
	}
   getch();
   return 0;
  }