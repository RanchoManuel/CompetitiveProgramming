using namespace std;
#include <cstdio>
#include <math.h>

int main()
{
	int casos, N, mile, juice, c, i;
	double estaCall;
	scanf("%d", &casos);

	for(c=1; c<=casos; c++)
	{
		mile=juice=0;
		scanf("%d", &N);

		for(i=0; i<N; i++)
		{
			scanf("%lf", &estaCall);
			mile +=ceil(estaCall/30.0)*10+((fmod(estaCall, 30.0)==0)?10:0);
			juice+=ceil(estaCall/60.0)*15+((fmod(estaCall, 60.0)==0)?15:0);
		}

		printf("Case %d: %s %d\n", c, (mile<juice)?"Mile":(mile>juice)?"Juice":"Mile Juice", (mile<=juice)?mile:juice);
	}

	return 0;
}
