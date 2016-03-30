#include "stdio.h"

#define TRUE 1
#define FALSE 0

int main()
{
	int B, N, R[20+2], D, C, V, i;
	int rta;
	while(scanf("%d %d", &B, &N), (B||N))
	{
		for(i=0; i<B; i++) scanf("%d", &R[i]);

		rta=TRUE;
		while(N--)
		{
			scanf("%d %d %d", &D, &C, &V);
			D--; C--;

			R[C]+=V;
			R[D]-=V;
		}

		for(i=0; i<B; i++)
		{
			if(R[i]<0)
			{
				rta=FALSE;
				break;
			}
		}
		puts(rta?"S":"N");
	}

	return 0;
}
