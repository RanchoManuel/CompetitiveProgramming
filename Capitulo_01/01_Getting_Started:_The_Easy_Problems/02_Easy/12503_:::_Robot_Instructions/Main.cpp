using namespace std;
#include <cstdio>
#include <cstring>

int main()
{
	int casos, n, inst[100], s, rta;
	char line[10];
	scanf("%d", &casos);
	
	while(casos--)
	{
		rta=0;
		scanf("%d", &n);
		for(int i=0; i<n; i++)
		{
			scanf("%s", line);
			
			puts(line);
			//printf("%d", s);
			/*
			if(strcmp("LEFT", line)==0) {inst[i]=-1; rta--;}
			else if(strcmp("RIGHT", line)==0) {inst[i]=1; rta++;}
			else
			{
				s--;
				inst[i]=inst[s];
				
				rta+=inst[i];
			}
			*/
		}
		puts(".........");
		//printf("%d\n", rta);
	}
	return 0;
}
