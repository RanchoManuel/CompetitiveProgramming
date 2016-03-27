using namespace std;
#include <iostream>
#include <cstdio>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	int N,B,H,W;
	while(scanf("%d %d %d %d", &N, &B, &H, &W)==4)
	{
		int minGasto=-1;
		for(int i=0; i<H; i++)
		{
			int p; cin >> p;
			int gasto=N*p;

			int beds;
			for(int j=0;j<W;j++)
			{
				cin >> beds;
				if(gasto<=B && beds>=N && (gasto<minGasto || minGasto==-1)) minGasto=gasto;
			}
		}
		if(minGasto==-1) puts("stay home");
		else printf("%d\n",minGasto);
	}

	return 0;
}
