//This program calculates average of two numbers

#include <stdio.h>

float average(float num1, float num2);

void main()
{
	float num1, num2, avg;
	printf("\nEnter first number : ");
	scanf("%f", &num1);
	printf("\nEnter second number : ");
	scanf("%f", &num2);
	avg = average(num1, num2);
	printf("\nThe average is %f", avg);
}
float average(float num1, float num2)
{
	float local_avg;
	local_avg = (num1 + num2) / 2;
	return(local_avg);
}