//This program allows user to enter the age
#include <stdio.h>
void main()
{
	int age;
	printf("\nPlease enter your age : ");
	scanf("%d", &age);
	while ((age <= 0) || (age > 100))
	{
		printf("\nInvalid age.\n");
		printf("\nPlease re - enter age.");
		scanf("%d", &age);
	}
}
