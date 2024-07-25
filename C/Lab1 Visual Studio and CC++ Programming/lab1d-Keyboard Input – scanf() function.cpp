/*3 Keyboard Input – scanf() function
Scanf() allows user to input data from the keyboard and assign to a variable */

#include <stdio.h>
void main()
{
	char sex;
	float height;
	printf("\nPlease enter the sex(M or F) : ");
	scanf("%c", &sex);
	printf("\nPlease enter the height : ");
	scanf("%f", &height);
	printf("\nSex is %c", sex);
	printf("\nHeight is %f", height);
}


//getchar() reads a character from keyboard
//gets() reads a string of text from keyboard