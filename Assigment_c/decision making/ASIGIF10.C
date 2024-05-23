//develop a progra that categorizes a given angle as acute, right,
// obtude, or straight based on its measure uing if statement
#include<stdio.h>
#include<conio.h>
main(){
   float angle;
   //input measure angle
   printf("enter the angle measure in degrees:");
   scanf("%f", &angle);
   //checkthe type of angle based on its measure
   if(angle>0 && angle<90){
      printf("the angle is acute.\n");
   }else if(angle==90){
      printf("the angle is a right angle.\n");
   }else if(angle>90 && angle<180){
      printf("the angle is obtuse.\n");
   } else {
      printf("Invalid angle measure. please enter a measure between 0 and 180 degrees.\n");
   }
getch();
}