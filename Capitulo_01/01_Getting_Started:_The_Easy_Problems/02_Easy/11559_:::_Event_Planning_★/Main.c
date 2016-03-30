#include "stdio.h"

int main()
{
	int N, B, H, W, minGasto, p, gasto, beds, i, j;
	while(scanf("%d %d %d %d", &N, &B, &H, &W)==4)
	{
		minGasto=-1;
		for(i=0; i<H; i++)
		{
			scanf("%d", &p);
			gasto=N*p;

			for(j=0;j<W;j++)
			{
				scanf("%d", &beds);
				if(gasto<=B && beds>=N && (gasto<minGasto || minGasto==-1)) minGasto=gasto;
			}
		}
		if(minGasto==-1) puts("stay home");
		else printf("%d\n",minGasto);
	}

	return 0;
}
