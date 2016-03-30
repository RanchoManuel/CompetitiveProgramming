#include "stdio.h"

int main()
{
	int casos, numCorredores, max, vEste, c;
	scanf("%d", &casos);
	for(c=1; c<=casos; c++)
	{
		scanf("%d", &numCorredores);
		max=0;
		while(numCorredores--)
		{
			scanf("%d", &vEste);
			if(vEste>max) max=vEste;
		}
		printf("Case %d: %d\n", c, max);
	}

	return 0;
}
