//WAP that determine the eligibility of a student for admission to a
//university based on their entrance exam score and prevoius academic
//performnce using if statements
#include<stdio.h>
#include<conio.h>
main(){
  float entranceExam, prevoiusAcademic;
  clrscr();
  //input exam score
  printf("enter exam score(out of 100):");
  scanf("%f", &entranceExam);
  printf("enter Previous academic performance(CGPA out of 10):");
  scanf("%f", &prevoiusAcademic);
  //find eligibility based on criteria
  if(entranceExam >= 70 && prevoiusAcademic >= 7.5){
     printf("Congratilations! you are eligible for admission");
  } else {
     printf("sorry, you are not eligible for admission");
  }
  getch();
}