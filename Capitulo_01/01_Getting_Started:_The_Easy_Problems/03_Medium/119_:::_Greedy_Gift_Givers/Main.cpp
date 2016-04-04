using namespace std;
#include <cstdio>
#include <iostream>
#include <string>
#include <map>

int main()
{
	map<string, int> mymap;
	int numGrupo, plata, aCuantos, seQueda, seEntrega, i, lol, acum;
	bool primero=true;
	string aQuien, nombres[10];
	
	while(scanf("%d", &numGrupo) != EOF)
	{
		mymap.clear();
		if(!primero) puts("");
		else primero=false;
		
		for(i=0; i<numGrupo; i++)
		{
			cin >> aQuien;
			mymap[aQuien]=0;
			nombres[i]=aQuien;
		}
		
		for(i=0; i<numGrupo; i++)
		{
			cin >> aQuien >> plata >> aCuantos;
			
			acum=mymap[aQuien];
			seEntrega=(aCuantos==0)?0:plata/aCuantos;
			seQueda=plata-seEntrega*aCuantos;
			acum+=seQueda;
			acum-=plata;
			mymap[aQuien]=acum;
			
			while(aCuantos--)
			{
				cin >> aQuien;
				lol=mymap[aQuien];
				lol+=seEntrega;
				mymap[aQuien]=lol;
			} 
		}
		
		for(i=0; i<numGrupo; i++)
			cout << nombres[i] << " " << mymap[nombres[i]] << endl;
	}
	
	return 0;
}
