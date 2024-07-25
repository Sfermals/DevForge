/*
1 printf() Function
To output variable values to the screen, we may use the printf() function as
follows:
*/


#include <stdio.h>

void main()
{
	int my_variable;
	
	my_variable = 10;


	printf("my_variable(decimal) = %d\n", my_variable);
	printf("my_variable(hex) = %x\n", my_variable);

}


/*
Note: % is known as a format specifier.
%d is used to display integer values in decimal number system.
%x is used to display an integer value in hexadecimal number system.
%c is used to display a character.
%s is used to display a string of text.

4.2.2 Escape Sequences
• Escape sequences are characters preceded by a backlash “\”.
• Escape sequences are used when you want to output special characters.
e.g. The newline escape sequence is “\n”

*/