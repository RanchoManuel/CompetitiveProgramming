using namespace std;
#include <cstdio>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	int cases, n, m, rta;
	scanf("%d",&cases);
	while(cases--)
	{
		scanf("%d %d",&n,&m);
		rta=(n/3)*(m/3);
		printf("%d\n",rta);
	}

	return 0;
}
