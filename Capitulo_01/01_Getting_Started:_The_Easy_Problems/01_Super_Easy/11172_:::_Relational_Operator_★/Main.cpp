using namespace std;
#include <cstdio>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	int cases, a, b;
	scanf("%d",&cases);
	while(cases--)
	{
		scanf("%d %d",&a,&b);
		if(a<b) puts("<");
		else if(a>b) puts(">");
		else puts("=");
	}

	return 0;
}
