using namespace std;
#include <cstdio>
#include <algorithm>

int main()
{
	int datos[3];
	int casos;

	scanf("%d",&casos);
	for(int c=1; c<=casos; c++)
	{
		scanf("%d %d %d", &datos[0], &datos[1], &datos[2]);
		sort(datos,datos+3);

		printf("Case %d: %d\n", c, datos[1]);
	}

	return 0;
}
