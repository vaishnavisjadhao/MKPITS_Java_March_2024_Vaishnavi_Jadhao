//display greatest no from array.
#include<stdio.h>
#include<conio.h>
main(){
 int arr[]={ 10, 20, 30, 40, 50};
 int max = arr[0];
 int i;
 clrscr();
 for(i=0; i<5; i++)
 {
   if(arr[i] > max)
   {
     max  = arr[i];
   }
 }
 printf("The greatest number in the array is %d\n", max);
 getch();
 return 0;
}