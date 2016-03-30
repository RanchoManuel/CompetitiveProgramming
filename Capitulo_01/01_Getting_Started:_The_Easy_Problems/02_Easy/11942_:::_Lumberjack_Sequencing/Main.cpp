using namespace std;
#include <cstdio>

int main()
{
	int casos, ant, actual;
	bool sortUp, sortDown;
	puts("Lumberjacks:");

	scanf("%d", &casos);
	while(casos--)
	{
		sortUp=true; sortDown=true;
		scanf("%d", &ant);
		for(int i=0; i<9; i++)//i no se usa
		{
			scanf("%d", &actual);
			if(actual>ant) sortDown=false;
			else if(actual<ant) sortUp=false;
			ant=actual;
		}
		puts(sortUp||sortDown?"Ordered":"Unordered");
	}

	return 0;
}
