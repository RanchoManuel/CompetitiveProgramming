using namespace std;
#include <cstdio>
#include <iostream>
#include <string>
#include <map>

int main()
{
	map<string, int> map;
	int numGrupo, plata, aCuantos, seQueda, seEntrega, i, lol, acum;
	bool primero=true;
	string aQuien, nombres[10];
	
	while(scanf("%d", &numGrupo) != EOF)
	{
		map.clear();
		if(!primero) puts("");
		else primero=false;
		
		for(i=0; i<numGrupo; i++)
		{
			cin >> aQuien;
			map[aQuien]=0;
			nombres[i]=aQuien;
		}
		
		for(i=0; i<numGrupo; i++)
		{
			cin >> aQuien >> plata >> aCuantos;
			
			acum=map[aQuien];
			seEntrega=(aCuantos==0)?0:plata/aCuantos;
			seQueda=plata-seEntrega*aCuantos;
			acum+=seQueda;
			acum-=plata;
			map[aQuien]=acum;
			
			while(aCuantos--)
			{
				cin >> aQuien;
				lol=map[aQuien];
				lol+=seEntrega;
				map[aQuien]=lol;
			} 
		}
		
		for(i=0; i<numGrupo; i++)
			cout << nombres[i] << " " << map[nombres[i]] << endl;
	}
	
	return 0;
}
