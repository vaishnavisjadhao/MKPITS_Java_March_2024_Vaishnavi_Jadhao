#include<stdio.h>
#include<conio.h>
main()
{
  int arr[100];
  int size,i, j, count;
  clrscr();
    printf("Enter Size of Array Elements: ");
    scanf("%d", &size);

    printf("Enter %d Number of Elements\n",size);
    for(i=0; i<size; i++)
    {
      scanf("%d", &arr[i]);
    }

    printf("Occurance of each Number\n");

    for(i=0; i<size; i++)
    {
	if(arr[i]== -1 )
	{
	   continue;
	}
	count = 0;

	for(j=i+1; j<size; j++)
	{
	    if(arr[i] == arr[j])
	    {
		count ++;
		arr[j] = -1;
	    }
	}
	//count++;
	printf("%d occured, %d times\n", arr[i], count);
    }
    getch();
    return 0;
}