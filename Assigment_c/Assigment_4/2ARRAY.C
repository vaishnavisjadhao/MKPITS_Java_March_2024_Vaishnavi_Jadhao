//create a program to merge two arrays into a single array
#include<stdio.h>
#include<conio.h>
main(){
 int arr1[5];
 int arr2[5];
 int arr3[10];
 int i;
 clrscr();
 //enter first array
 printf("Enter Elements in first array: \n");
  for(i=0; i<5; i++) {
    scanf("%d", &arr1[i]);
  }
 //second array
 printf("Enter Elements in second array\n: ");
  for(i=0; i<5; i++) {
    scanf("%d", &arr2[i]);
  }
 //merge both arr1 and arr2 in arr3
 printf("\nElements of array after merraage: ");
  for(i=0; i<5; i++) {
    arr3[i] = arr1[i];
    arr3[i] = arr2[i];
  }
  //print arr3 means mearge array
  for(i=0; i<10; i++) {
    printf(" %d", arr3[i]);
  }
  getch();
  return 0;
}