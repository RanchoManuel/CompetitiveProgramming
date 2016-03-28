#include "stdio.h"
#include "string.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	char s[1000];
	int num, f, i;
	scanf("%d", &num);
	while(num)
	{
		sprintf(s, "%d", num);
		while(strlen(s)>1)
		{
			f=0;
			for(i=0; i<strlen(s); i++) f+=(s[i]-'0');
			sprintf(s, "%d", f);
		}
		printf("%c\n", s[0]);
		scanf("%d", &num);
	}

	return 0;
}
