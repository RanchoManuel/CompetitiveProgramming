using namespace std;
#include <cstdio>
#include <cstring>
#include <math.h>

int main()
{
	char song[16][10]={"Happy","birthday","to","you","Happy","birthday","to","you","Happy","birthday","to","Rujia","Happy","birthday","to","you"};
		
	int n;
	scanf("%d", &n);
	char family[100+10][n];
	for(int i=0; i<n; i++) scanf("%s", family[i]);
	
	if(n <= 16)
		for(int i=0; i<16; i++)
			printf("%s: %s\n",family[i%n], song[i]);
	else
	{
		int reps=(int)ceil(n/16.0);
		for(int i=0; i<reps; i++)
			for(int j=0; j<16; j++)
				printf("%s: %s\n", family[(i*16+j)%n], song[j]);
	}
	
	return 0;
}
