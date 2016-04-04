using namespace std;
#include <cstdio>

int main()
{
	int caso, n, m, c, mpc, max, lect, i;
	int amp[20][2];
	for(caso=1; scanf("%d %d %d", &n, &m, &c),(n||m||c); caso++)
	{
		mpc=max=0;

		for(i=0; i<n; i++)
		{
			scanf("%d", &amp[i][0]);
			amp[i][1] = 0;
		}

		while(m--)
		{
			scanf("%d", &lect);
			lect--;
			if(amp[lect][1] == 0)
			{
				mpc += amp[lect][0];
				amp[lect][1] = 1;
			}
			else
			{
				mpc -= amp[lect][0];
				amp[lect][1] = 0;
			}
			if(max < mpc) max = mpc;
		}

		printf("Sequence %d\n", caso);
		if(max > c) puts("Fuse was blown.");
		else
		{
			puts("Fuse was not blown.");
			printf("Maximal power consumption was %d amperes.\n", max);
		}
		puts("");
	}
	
	return 0;
}
