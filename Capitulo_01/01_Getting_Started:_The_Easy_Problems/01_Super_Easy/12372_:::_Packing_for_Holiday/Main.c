#include "stdio.h"

int main()
{
	int casos, L, W, H, c;
	scanf("%d",&casos);

	for(c=1; c<=casos; c++)
	{
		scanf("%d %d %d", &L, &W, &H);

		printf("Case %d: ", c);
		if(L<=20 && W<=20 && H<=20) puts("good");
		else puts("bad");
	}

	return 0;
}
