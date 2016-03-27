#include "stdio.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	int casos, largo, ant, actual, subidas, bajadas, c;
	scanf("%d", &casos);
	for(c=1; c<=casos; c++)
	{
		scanf("%d", &largo);
		subidas=0; bajadas=0;

		largo--;
		scanf("%d", &ant);
		while(largo--)
		{
			scanf("%d", &actual);
			if(ant>actual) bajadas++;
			else if(ant<actual) subidas++;
			ant=actual;
		}
		printf("Case %d: %d %d\n", c, subidas, bajadas);
	}

	return 0;
}
