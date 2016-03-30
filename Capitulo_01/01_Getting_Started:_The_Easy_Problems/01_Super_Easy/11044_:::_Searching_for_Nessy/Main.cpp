using namespace std;
#include <cstdio>

int main()
{
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
