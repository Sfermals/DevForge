#include <stdio.h>
void main()
{
	int num1, num2, sum;
	printf("\nWhat is the first number ? ");
	scanf("%d", &num1);
	printf("\nWhat is the second number ? ");
	scanf("%d", &num2);
	sum = num1 + num2;
	printf("\nSum of %d + %d is %d\n", num1, num2, sum);
}