//implement a program to find the second largest element in an array
#include<stdio.h>
#include<conio.h>
main(){
  int arr[]={5, 2, 3, 7, 8};
  int num, i;
  clrscr();
   printf("Enter No:");
   scanf("%d", &num);
   for(i=0; i<10;  i++)
   {
    if(num == arr[i])
    {
       printf("Number found at %d position", arr[i]);
       break;
     }
    if(i == num)
    {
      printf("%d is not preasent in array", i);
    }
   }
}



















/* int arr[] = {5, 3,8,2,7};
  int n = sizeof(arr) / sizeof(arr[0]);
  int largest = arr[0];
  int second_largest = arr[0];
  int i;

  for(i=1; i<n; i++){
    if (arr[i] > largest) {
       second_largest = largest;
       largest = arr[i];
    }
    else(arr[i] > second_largest && arr[i]! = largest) {
       second_largest = arr[i];
    }
  }

  printf("Second largest element is : %d", second_largest);
  getch();
  return 0;*/