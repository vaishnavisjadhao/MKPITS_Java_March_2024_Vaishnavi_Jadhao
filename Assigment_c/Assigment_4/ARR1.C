//Sum of content of array
#include<stdio.h>
#include<conio.h>
main(){
 int arr[] = {1, 2, 3, 4, 5};
 int i, sum=0;
 //float avg;
 clrscr();
 for(i=0; i<5; i++){
   sum =sum+arr[i];
 };
 printf("sum =%d", sum);
 getch();
 return 0;
}