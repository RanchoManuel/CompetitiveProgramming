#include "stdio.h"
#include "string.h"

int main()
{
	char s [2000];
	int casos; scanf("%d", &casos);
	while(casos--)
	{
		scanf("%s", s);
		int length=strlen(s);

		if(strcmp(s,"4")==0 || strcmp(s,"78")==0 || strcmp(s,"1")==0) printf("+");
		else if(s[length-2]=='3' && s[length-1]=='5') printf("-");
		else if(s[0]=='9'&& s[length-1]=='4') printf("*");
		else if(s[0]=='1' && s[1]=='9' && s[2]=='0') printf("?");
		printf("\n");
	}

	return 0;
}
