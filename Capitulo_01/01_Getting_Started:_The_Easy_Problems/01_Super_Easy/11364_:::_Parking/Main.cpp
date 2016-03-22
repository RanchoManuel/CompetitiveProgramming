using namespace std;
#include <cstdio>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

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
