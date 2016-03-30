#include "stdio.h"

int main()
{
	int casos, granjas, rta, size, environment, noUso;
	scanf("%d",&casos);
	while(casos--)
	{
		scanf("%d",&granjas);
		rta=0;
		while(granjas--)
		{
			scanf("%d %d %d",&size, &noUso, &environment);
			rta+=(size*environment);
		}
		printf("%d\n",rta);
	}
		
	return 0;
}
