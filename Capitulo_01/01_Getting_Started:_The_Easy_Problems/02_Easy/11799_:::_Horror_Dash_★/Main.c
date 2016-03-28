#include "stdio.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);

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
