#include "stdio.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);

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
