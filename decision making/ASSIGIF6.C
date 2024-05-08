//WAP that categorizes a givn persons BMI(body mass index) into different
//weight categories(underweight, normal weight, overweight, obese)using if
#include<stdio.h>
#include<conio.h>
main(){
float weight;    //variable for store weight & height
float height;
float bmi;
clrscr();
printf("Enter the weight in kg:");
scanf("%f", &weight);
printf("Enter the height in m:");
scanf("%f", &height);
//calculate bmi
bmi = weight / (height * height);
//
if(bmi < 18.5) {
   printf("your bmi is %2f. your are underweight", bmi);
}else if(bmi >= 18.5 && bmi < 25) {
   printf("your bmi is %.2f. you are normal weight",bmi);
}else if (bmi >= 25 && bmi < 30) {
   printf("your bmi is %2f. you are overweight", bmi);
}else {
   printf("your bmi is %2f. you are obese", bmi);
}
getch();
}