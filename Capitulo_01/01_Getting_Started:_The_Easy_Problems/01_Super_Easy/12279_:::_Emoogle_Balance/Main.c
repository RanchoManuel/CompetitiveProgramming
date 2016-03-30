#include "stdio.h"

int main()
{
	int numMax, numCeros, actual, c, j;
	scanf("%d", &numMax);

	for(c=1; numMax!=0; c++)
	{
		numCeros=0;
		for(j=0; j<numMax; j++)
		{
			scanf("%d", &actual);
			if(actual==0) numCeros++;
		}

		printf("Case %d: %d\n", c, (numMax-(2*numCeros)));
		scanf("%d", &numMax);
	}

	return 0;
}
