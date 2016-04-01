#include "stdio.h"
#include "stdlib.h"

#define MIN(a,b) (((a)<(b))?(a):(b))
#define MAX(a,b) (((a)>(b))?(a):(b))

int main()
{
	int a, b;

	while(scanf("%d %d", &a, &b), (a!=-1||b!=-1))
		printf("%d\n", MIN(abs(a-b), MIN(a,b)+100-MAX(a,b)));

	return 0;
}
