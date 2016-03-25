using namespace std;
#include <cstdio>
#include <cstring>

bool test=true;

int main()
{
	if(test) freopen("in.txt","r",stdin);

	char comando[6];
	scanf("%s", comando);
	for(int c=1; strcmp(comando,"*")!=0; c++)
	{
		printf("Case %d: ", c);
		if(strcmp(comando,"Hajj")==0) printf("Hajj-e-Akbar\n");
		else printf("Hajj-e-Asghar\n");
		scanf("%s",comando);
	}

	return 0;
}
