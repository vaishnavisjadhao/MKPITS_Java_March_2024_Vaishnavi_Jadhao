// display smallest no from array
#include<stdio.h>
#include<conio.h>
main(){
 int arr[] = {10, 20, 30, 40, 50};
 int i, num, min=arr[0];
 clrscr();
 for(i=0; i<5; i++)
 {
   if(arr[i] < min)
   {
     min = arr[i];
   }
 }
 printf("the smallest no in the array is: %d", min);
 getch();
 return 0;
}