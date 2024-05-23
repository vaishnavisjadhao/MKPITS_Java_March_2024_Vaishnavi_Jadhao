//find min and max element. in array
#include <stdio.h>
#include<conio.h>
int main()
{
    int arr1[100];
    int i, max, min, num;
    clrscr();
    //input from user
    printf("\n\nFind maximum and minimum element in an array :\n");
    printf("Input the number of elements to be stored in the array :");
    scanf("%d", &num);

    // Input elements for the array
    printf("Input %d elements in the array :\n", num);
    for (i = 0; i < num; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &arr1[i]);
    }

    // Initialize max and min with the first element of the array
    max = arr1[0];
    min = arr1[0];

    // Traverse the array to find the maximum and minimum elements
    for (i = 1; i < num; i++)
    {
	// Update max if the current element is greater
	if (arr1[i] > max)
        {
	    max = arr1[i];
        }

	// Update min if the current element is smaller
	if (arr1[i] < min)
        {
	    min = arr1[i];
        }
    }

    // Print the maximum and minimum elements
    printf("Maximum element is : %d\n", max);
    printf("Minimum element is : %d\n\n", min);
    getch();
    return 0;
}
