#include "stdio.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);
	
	char c;
	int aux=0;

	while(scanf("%c",&c)!=EOF)
	{
		if(c=='"')
		{
			if(aux++%2==0) printf("``");
			else printf("''");
		}
		else printf("%c",c);
	}

	return 0;
}
