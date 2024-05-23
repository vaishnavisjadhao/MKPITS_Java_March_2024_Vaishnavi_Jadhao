// count total even and odd number
#include<stdio.h>
#include<conio.h>
main(){
  int arr[] = {1, 7, 8, 4, 5, 16 ,8};
  int n = sizeof(arr)/sizeof(arr[0]);
  int i, even_count=0, odd_count=0;
  clrscr();
  for(i=0; i<n; i++)
  {
    if(arr[i] % 2 == 0)
    {
       even_count++;
    } else
      {
	odd_count++;
      }
  }
  printf("total count of even numbers: %d\n", even_count);
  printf("total count  of odd numbers: %d\n", odd_count);
  getch();
  return 0;
}