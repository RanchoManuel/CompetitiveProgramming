#include "stdio.h"

#define TRUE 1
#define FALSE 0

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	int casos, W, y1, y2, diff=0;
	int rta, primero;
	
	scanf("%d", &casos);
	while(casos--!=0)
	{
		scanf("%d", &W);
		
		rta=primero=TRUE;
		while(W--!=0)
		{
			scanf("%d %d", &y1, &y2);

			if(primero)
			{
				diff=y1-y2;
				primero=FALSE;
			}
			else if(y1-y2!=diff) rta=FALSE;
		}
		puts(rta?"yes":"no");
		if(casos) puts("");
	}
	
	return 0;
}
