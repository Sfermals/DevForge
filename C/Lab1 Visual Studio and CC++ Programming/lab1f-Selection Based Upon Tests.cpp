#include <stdio.h>
void main()
{
	int temperature;

	printf("\nEnter temperature : ");
	scanf("%d", &temperature);

	if(temperature <= 0)
		printf("Too cold!\n");
	else
		
		if (temperature >= 100)
			printf("Too hot!\n");
		else
			printf("Ok.\n");
}

//if - 5 Selection Based Upon Tests