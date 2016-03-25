#include "stdio.h"
#include "string.h"

int test=1;

int main()
{
	if(test) freopen("in.txt","r",stdin);
	
	char one[]={'o','n','e'};
	char linea[6];
	int casos, tam, num1, j;
	scanf("%d",&casos);

	while(casos--)
	{
		scanf("%s",linea);
		tam=strlen(linea);

		if(tam==5) puts("3");
		else
		{
			num1=0;
			for(j=0; j<tam; j++) if(linea[j]==one[j]) num1++;
			if(num1>=2) puts("1");
			else puts("2");
		}
	}

	return 0;
}
