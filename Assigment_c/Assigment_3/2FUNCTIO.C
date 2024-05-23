//WAF to accept a marks as an argument if it is >= 50 display pass otherwise fail
 #include<stdio.h>
 #include<conio.h>
 int resultCheck();
   int main() {
     resultCheck();
   }

 int resultCheck(int marks){
  // int marks;
   clrscr();
   printf("Enter Marks: ");
   scanf("%d", &marks);
   if(marks>=50){
     printf("Pass");
   } else {
	printf("Fail");
     }
   getch();
   return 0;
 }
