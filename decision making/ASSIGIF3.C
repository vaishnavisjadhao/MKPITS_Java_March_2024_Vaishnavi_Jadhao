//WAP that calculate the net salary of an employee based on their basic salry
//, allowances an deductions using if statements.
#include<stdio.h>
#include<conio.h>
main(){
//aditional payment(alowance)
float basicsalary, allowance, deduction;   //80%of basicsalary allowance and 20% deduction
float netsalary; //inhand_salary
clrscr();
//input required
printf("enter basicsalary:");
scanf("%f", &basicsalary);
printf("enter allowances:");
scanf("%f", &allowance);
printf("enter deduction:");
scanf("%f", &deduction);
if(basicsalary > 5000){
allowance = basicsalary * 0.8;
deduction = basicsalary * 0.2;
} else {
allowance = basicsalary * 0.7;
deduction = basicsalary * 0.15;
}
netsalary = basicsalary + allowance-deduction;
printf(" netsalary is:$%f.\n", netsalary);
getch();
}







