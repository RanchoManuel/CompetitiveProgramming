#include "stdio.h"
#include "string.h"

int main()
{
	int casos, n, inst[100], s, rta, i;
	char line[10], garbage[10];
	scanf("%d", &casos);
	
	while(casos--)
	{
		rta=0;
		scanf("%d", &n);
		for(i=0; i<n; i++)
		{
			scanf("%s", line);
			
			if(strcmp("LEFT", line)==0) {inst[i]=-1; rta--;}
			else if(strcmp("RIGHT", line)==0) {inst[i]=1; rta++;}
			else
			{
				scanf("%s %d", garbage, &s);
				s--;
				inst[i]=inst[s];
				
				rta+=inst[i];
			}
		}
		printf("%d\n", rta);
	}
	
	return 0;
}
