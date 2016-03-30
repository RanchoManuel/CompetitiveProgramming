#include "stdio.h"

int main()
{
	int x, y, xp, yp, casos;

	scanf("%d",&casos);
	while(casos!=0)
	{
		scanf("%d %d",&x,&y);
		while(casos--)
		{
			scanf("%d %d",&xp,&yp);

			if(xp==x||yp==y) puts("divisa");
			else if(xp>x&&yp>y) puts("NE");
			else if(xp<x&&yp>y) puts("NO");
			else if(xp<x&&yp<y) puts("SO");
			else if(xp>x&&yp<y) puts("SE");
		}
		scanf("%d",&casos);
	}

	return 0;
}
