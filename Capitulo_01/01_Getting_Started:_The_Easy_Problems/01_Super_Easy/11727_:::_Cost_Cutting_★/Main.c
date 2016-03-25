#include "stdio.h"

int test=1;

int compare(const void * a, const void * b)
{
	return(*(int*)a - *(int*)b);
}

int main()
{
	if(test) freopen("in.txt","r",stdin);
	
	int datos[3];
	int casos, c;

	scanf("%d",&casos);
	for(c=1; c<=casos; c++)
	{
		scanf("%d %d %d", &datos[0], &datos[1], &datos[2]);
		qsort(datos, 3, sizeof(int), compare);

		printf("Case %d: %d\n", c, datos[1]);
	}
	
	return 0;
}
