#include "stdio.h"

#define TRUE 1;
#define FALSE 0;

int main()
{
	int casos, ant, actual, i;
	int sortUp, sortDown;
	puts("Lumberjacks:");

	scanf("%d", &casos);
	while(casos--)
	{
		sortUp=TRUE; sortDown=TRUE;
		scanf("%d", &ant);
		for(i=0; i<9; i++)//i no se usa
		{
			scanf("%d", &actual);
			if(actual>ant){ sortDown=FALSE;}
			else if(actual<ant){ sortUp=FALSE;}
			ant=actual;
		}
		puts(sortUp||sortDown?"Ordered":"Unordered");
	}

	return 0;
}
