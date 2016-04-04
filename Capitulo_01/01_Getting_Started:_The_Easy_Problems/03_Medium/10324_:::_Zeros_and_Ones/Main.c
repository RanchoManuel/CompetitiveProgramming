#include "stdio.h"

#define MIN(a,b) (((a)<(b))?(a):(b))
#define MAX(a,b) (((a)>(b))?(a):(b))

int main()
{
	char linea[1000005];
	int c=1, casos, a, b, init, fin, j;
	char anterior;
	int iguales;

	while(scanf("%s", linea)!=EOF)
	{
		printf("Case %d:\n", c++);

		scanf("%d", &casos);
		while(casos--)
		{
			scanf("%d %d", &a, &b);
			init=MIN(a,b);
			fin=MAX(a,b);

			anterior=linea[init];
			iguales=1;
			for(j=init+1; j<=fin; j++)
			{
				if(anterior!=linea[j])
				{
					iguales=0;
					break;
				}
				anterior=linea[j];
			}
			puts(iguales?"Yes":"No");
		}
	}

	return 0;
}
