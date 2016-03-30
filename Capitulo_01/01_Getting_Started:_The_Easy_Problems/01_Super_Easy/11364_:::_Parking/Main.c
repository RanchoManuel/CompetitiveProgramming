#include "stdio.h"

int main()
{
	int casos, mayor, menor, este, tam, i;

	scanf("%d",&casos);
	while(casos--)
	{
		menor=99;
		mayor=0;
		scanf("%d",&tam);
		for(i=0; i<tam; i++)
		{
			scanf("%d",&este);
			if(este>mayor) mayor=este;
			if(este<menor) menor=este;
		}
		printf("%d\n",(2*(mayor-menor)));
	}

	return 0;
}
