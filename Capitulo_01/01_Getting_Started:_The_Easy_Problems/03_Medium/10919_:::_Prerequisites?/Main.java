import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int k, m, c, r;
		Set<String> cursos=new HashSet<String>();
		boolean pasa;
		
		for(String line, aux[]; !(line=br.readLine()).equals("0");)
		{
			cursos.clear();
			aux=line.split("\\s+");
			k=Integer.parseInt(aux[0]);
			m=Integer.parseInt(aux[1]);
			
			aux=br.readLine().split("\\s+");
			for(String curso: aux) cursos.add(curso);
			
			pasa=true;
			while(m--!=0)
			{
				aux=br.readLine().split("\\s+");
				c=Integer.parseInt(aux[0]);
				r=Integer.parseInt(aux[1]);
				
				for(int i=2; i<c+2 && r>0; i++)
					if(cursos.contains(aux[i]))
						r--;
				
				if(r>0) pasa=false;
			} 
			
			System.out.println(pasa?"yes":"no");
		}
		//-----------------------------------------------------------
		br.close();
	}
}
