//develop a program to sort elements of an array in ascending order.
#include<stdio.h>
#include<conio.h>
main(){
  int num[5], i, j, temp;
  clrscr();
  printf("Enter Array Element: ");
  for(i=0; i<5; i++)
  {
     scanf("%d",&num[i]);
  }
  for(i=0; i<4; i++) {
    for(j=0; j<4-i; j++) {
       if(num[j]> num[j+1]) {
	temp = num[j];
	num[j] = num[j+1];
	num[j+1]=temp;
       }
     }

 }
  printf("Sorted Aray: ");
  for(i=0; i<5; i++){
    printf("\n%d",num[i]);
  }
  getch();
  return 0;
}