using namespace std;
#include <cstdio>
#include <cstring>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	char one[]={'o','n','e'};
	char linea[6];
	int casos, tam, num1;
	scanf("%d",&casos);

	while(casos--)
	{
		scanf("%s",linea);
		tam=strlen(linea);

		if(tam==5) puts("3");
		else
		{
			num1=0;
			for(int j=0; j<tam; j++) if(linea[j]==one[j]) num1++;
			if(num1>=2) puts("1");
			else puts("2");
		}
	}

	return 0;
}
