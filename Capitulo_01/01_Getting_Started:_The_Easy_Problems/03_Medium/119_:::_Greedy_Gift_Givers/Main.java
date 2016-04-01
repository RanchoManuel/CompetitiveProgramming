import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		Map<String, Integer> m=new LinkedHashMap<String, Integer>();
		int numGrupo, plata, aCuantos, seQueda, seEntrega;
		boolean primero=true;
		
		for(String line, aux[]; (line=br.readLine())!=null;)
		{
			if(!primero) System.out.println();
			else primero=false;
			
			m.clear();
			numGrupo=Integer.parseInt(line);
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
		//-----------------------------------------------------------
		br.close();
	}
}
