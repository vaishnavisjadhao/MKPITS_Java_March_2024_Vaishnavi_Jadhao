//write a c program to find the frequency of each element in array.
#include<stdio.h>
#include<conio.h>
main(){
 int arr[] = {10, 30, 10, 20, 10, 20, 30, 10};
 int n = sizeof(arr)/sizeof(arr[0]);
 int visited[n];
 int i, j;
 clrscr();
 for(i=0; i<n; i++){
   if(visited[i]==0){
     int count = 1;
     for(j=i+1; j<n; j++){
       if(arr[i]==arr[j]{
	 count++;
	 visited[j]=1;
       }
     }
     printf("%d occur %d times\n", arr[i], count);
   }
 }
 getch();
 return 0;
}