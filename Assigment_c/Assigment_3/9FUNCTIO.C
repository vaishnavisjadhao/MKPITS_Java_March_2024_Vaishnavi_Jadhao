// C program to demonstrate an
// armstrong number between the
// given intervals using pow()
#include <math.h>
#include <stdio.h>
int main()
{
  int s = 1, e = 500, num1, n, arm = 0, i, num2, c;
  clrscr();
 // Iterating the for loop using the given intervals
  for (i = s; i <= e; i++)
  {
   num1 = i;
   num2 = i;
  // Finding the number of digits
  while (num1 != 0)
  {
   num1 = num1 / 10;
   ++c;
  }
  // Finding the armstrong number
  while (num2 != 0)
  {
   n = num2 % 10;
   arm = arm + pow(n, c);
   num2 = num2 / 10;
  }
  // If number is equal to the arm then it is a armstrong number
  if (arm == i)
  {
    printf("%d\n", i);
  }
     arm = 0;
     c = 0;
 }
  getch();
  return 0;
}
