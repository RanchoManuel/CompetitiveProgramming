#include "stdio.h"

int main()
{
	double i, posSnail, subida;
	int H, U, D, F;

	while(scanf("%d %d %d %d", &H, &U, &D, &F), (H || U || D || F))
	{
		i=1; posSnail=0;
		while(1)
		{
			subida=(U-(U*(i-1)*F/100));
			posSnail+=(subida>=0)?subida:0;
			if(posSnail>H)break;
			posSnail-=D;
			if(posSnail<0)break;
			i++;
		}

		printf("%s on day %d\n", (posSnail<0)?"failure":"success", (int)i);
	}

	return 0;
}
