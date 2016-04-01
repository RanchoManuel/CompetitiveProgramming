using namespace std;
#include <cstdio>
#include <cstdlib> //abs
#include <algorithm> //min

int main()
{
	int a, b;

	while(scanf("%d %d", &a, &b), (a!=-1||b!=-1))
		printf("%d\n", min(abs(a-b), min(a,b)+100-max(a,b)));

	return 0;
}
