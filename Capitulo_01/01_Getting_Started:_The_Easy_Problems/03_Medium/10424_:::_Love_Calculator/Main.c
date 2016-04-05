#include "stdio.h"
#include "string.h"

#define MIN(a,b) (((a)<(b))?(a):(b))
#define MAX(a,b) (((a)>(b))?(a):(b))

int main()
{
	char s1[100], s2[100];
	int sum1, sum2, i;
	double rta;

	while(scanf("%s", s1)!=EOF)
	{
		scanf("%s", s2);

		sum1=sum2=0;
		for(i=0; i<strlen(s1); i++)
		{
			if(isalpha(s1[i]))
			{
				s1[i]=tolower(s1[i]);
				sum1+=(s1[i]-'a'+1);
			}
		}

		for(i=0; i<strlen(s2); i++)
		{
			if(isalpha(s2[i]))
			{
				s2[i]=tolower(s2[i]);
				sum2+=(s2[i]-'a'+1);
			}
		}

		sprintf(s1, "%d", sum1);
		while(strlen(s1)!=1)
		{
			sum1=0;
			for(i=0; i<strlen(s1); i++) sum1+=(s1[i]-'0');
			sprintf(s1, "%d", sum1);
		}

		sprintf(s2, "%d", sum2);
		while(strlen(s2)!=1)
		{
			sum2=0;
			for(i=0; i<strlen(s2); i++) sum2+=(s2[i]-'0');
			sprintf(s2, "%d", sum2);
		}

		rta=(double)MIN(sum1, sum2)*100.0/(double)MAX(sum1, sum2);
		printf("%.2f %%\n", rta);
	}

	return 0;
}
