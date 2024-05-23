//WAF to accept a marks as an argument if it is >= 50 display pass otherwise fail
 #include<stdio.h>
 #include<conio.h>
 //main(){
 int checkNumber();
    int main(){
       checkNumber();
   }

 int checkNumber(int num){
  // int num;
   clrscr();
   printf("Enter Marks: ");
   scanf("%d", &num);
   if(num%2==0){
     printf("It's Even NUmber");
   } else {
	printf("It's Odd Number");
     }
   getch();
   return 0;
 }