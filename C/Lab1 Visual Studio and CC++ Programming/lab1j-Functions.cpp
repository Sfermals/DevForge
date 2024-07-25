/*
Functions
This program reads two numbers from the keyboard and prints out the sum
*/
#include <stdio.h>

int num1, num2, sum; //global variables
void printsum(void); //function prototype

void main()
{
	printf("\nEnter the first number : ");
	scanf("%d", &num1);

	printf("\nEnter the second number : ");
	scanf("%d", &num2);

	sum = num1 + num2;
	printsum();
}
void printsum(void)
{
	printf("\nThe sum is %d\n", sum);
	return;
}
