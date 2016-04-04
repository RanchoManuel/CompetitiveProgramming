using namespace std;
#include <cstdio>
#include <algorithm>

int main()
{
	char linea[1000005];
	int c=1, casos, a, b, init, fin;
	char anterior;
	bool iguales;

	while(scanf("%s", linea)!=EOF)
	{
		printf("Case %d:\n", c++);

		scanf("%d", &casos);
		while(casos--)
		{
			scanf("%d %d", &a, &b);
			init=min(a,b);
			fin=max(a,b);

			anterior=linea[init];
			iguales=true;
			for(int j=init+1; j<=fin; j++)
			{
				if(anterior!=linea[j])
				{
					iguales=false;
					break;
				}
				anterior=linea[j];
			}
			puts(iguales?"Yes":"No");
		}
	}
	return 0;
}
