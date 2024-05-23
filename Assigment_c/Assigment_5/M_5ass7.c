//find duplicates in an array.
#include<stdio.h>
#include<conio.h>
main()
{
  int arr[100];
  int size,i, j, count=0;
  int *ptr;
  clrscr();
  printf("Enter Size of Array Elements: ");
  scanf("%d", &size);

  printf("Enter %d Number of Elements\n",size);
  for(i=0; i<size; i++)
  {
    scanf("%d", &arr[i]);
  }

  printf("Occurance of each Number");

  for(i=0; i<size; i++)
  {
	  if(arr[i]== 0 )
	  {
	    continue;
	  }

	  for(j=i+1; j<size; j++)
	  {
	    if(arr[i] == arr[j]) //check arr[i] and arr[j]
	    {
        //if duplicate found set duplicate element to 0 to mark it for removel
		    arr[j] = 0;  
	    }
	  }
    //after inner loop complete it increment a count
	  count++;
  }

  printf("\n count= %d\n",count);
  ptr=(int *)malloc(sizeof(int)* count);
  for(i=0,j=0; i<size; i++)
  {
    if(arr[i]!=0)
    {
	    *(ptr+i)= arr[i];
	    j++;
    }
  }

  for(i=0; i<count; i++)
  {
    printf("\n %d",*(ptr+i));
  }
  getch();
  return 0;
}