#include "stdio.h"

int main()
{
	int m[10+1];
	int numGrupo, plata, aCuantos, seQueda, seEntregam i;
	int primero=1;
	
	while(scanf("%d", &numGrupo) != EOF)
	{
		if(!primero) puts("");
		else primero=0;
		
		for(i=0; i<numGrupo; i++) 
		aux=br.readLine().split(" ");
		for(String nombre: aux) m.put(nombre, 0);
		
		while(numGrupo--!=0)
		{
			aux=br.readLine().split(" ");
			Integer acum=m.get(aux[0]);
			plata=Integer.parseInt(aux[1]);
			aCuantos=Integer.parseInt(aux[2]);
			
			seEntrega=(aCuantos==0)?0:plata/aCuantos;
			seQueda=plata-seEntrega*aCuantos;
			acum+=seQueda;
			acum-=plata;
			m.put(aux[0], acum);
			
			for(int i=0; i<aCuantos; i++)
			{
				Integer lol=m.get(aux[i+3]);
				lol+=seEntrega;
				m.put(aux[i+3], lol);
			} 
		}
		
		for(Entry<String, Integer> entry : m.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
	}
	return 0;
}
