#include "stdio.h"
#include "string.h"

char mi [10+1][12+1];
int mv[10+1];
int numGrupo;

void putEnMapa(char* aQuien, int acum)
{
	int i;	
	for(i=0; i<numGrupo; i++)
		if(strcmp(aQuien, mi[i])==0)
			mv[i]=acum;
}

int getDelMapa(char* aQuien)
{
	int i;	
	for(i=0; i<numGrupo; i++)
		if(strcmp(aQuien, mi[i])==0)
			return mv[i];
}

int main()
{

	int plata, aCuantos, seQueda, seEntrega, i, lol, acum;
	int primero=1;
	char aQuien [12+1];
	
	while(scanf("%d", &numGrupo) != EOF)
	{
		if(!primero) puts("");
		else primero=0;
		
		for(i=0; i<numGrupo; i++)
		{
			scanf("%s", mi[i]);
			mv[i]=0;	
		}
		
		for(i=0; i<numGrupo; i++)
		{
			scanf("%s %d %d", aQuien, &plata, &aCuantos);
			
			acum=getDelMapa(aQuien);
			seEntrega=(aCuantos==0)?0:plata/aCuantos;
			seQueda=plata-seEntrega*aCuantos;
			acum+=seQueda;
			acum-=plata;
			putEnMapa(aQuien, acum);
			
			while(aCuantos--)
			{
				scanf("%s", aQuien);
				lol=getDelMapa(aQuien);
				lol+=seEntrega;
				putEnMapa(aQuien, lol);
			} 
		}
		
		for(i=0; i<numGrupo; i++)
			printf("%s %d\n", mi[i], mv[i]);
	}
	
	return 0;
}
