using namespace std;
#include <cstdio>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);
	
	int casos, W, y1, y2, diff=0;
	bool rta, primero;
	
	scanf("%d", &casos);
	while(casos--!=0)
	{
		scanf("%d", &W);
		
		rta=primero=true;
		while(W--!=0)
		{
			scanf("%d %d", &y1, &y2);

			if(primero)
			{
				diff=y1-y2;
				primero=false;
			}
			else if(y1-y2!=diff) rta=false;
		}
		puts(rta?"yes":"no");
		if(casos) puts("");
	}
	
	return 0;
}
