//This program finds average of a set of numbers
#include <stdio.h>
void main()
{
	int count;
	float number, sum, average;
	count = 0;
	sum = 0;
	do
	{
		printf("\nEnter Number(0 to terminate) : ");
		scanf("%f", &number);
		if (number != 0)
		{
			sum = sum + number;
			count = count + 1;
		}
	} while (number != 0);
	average = sum / count;
	printf("\nThe average of the %d numbers is %.2f\n", count, average);
}
