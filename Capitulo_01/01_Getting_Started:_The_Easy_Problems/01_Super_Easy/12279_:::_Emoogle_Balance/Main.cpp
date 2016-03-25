using namespace std;
#include <cstdio>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	int numMax, numCeros, actual;
	scanf("%d", &numMax);

	for(int c=1; numMax!=0; c++)
	{
		numCeros=0;
		for(int j=0; j<numMax; j++)
		{
			scanf("%d", &actual);
			if(actual==0) numCeros++;
		}

		printf("Case %d: %d\n", c, (numMax-(2*numCeros)));
		scanf("%d", &numMax);
	}
	
	return 0;
}
