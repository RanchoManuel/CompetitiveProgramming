#include "stdio.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);
	
	char c;
	while(scanf("%c",&c)!=EOF) printf("%c",c);

	//char equation[100];
	//while(gets(equation)) puts(equation);

	return 0;
}
