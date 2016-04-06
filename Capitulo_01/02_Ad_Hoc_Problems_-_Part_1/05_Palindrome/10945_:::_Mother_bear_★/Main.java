import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		String filtro1;
		char[] letras, filtrado;
		int tam;
		boolean palindroma;
		
		while(String linea; !(linea=br.readLine()).equals("DONE");)
		{
			letras=linea.toCharArray();
			filtro1="";
			for(char c : letras) 
			{
				if(c>=65 && c<=90) filtro1+=(char)(c+32);
				else if(c>=97 && c<=122) filtro1+=c;
			}

			palindroma=true;
			filtrado=filtro1.toCharArray();
			tam=filtrado.length;
			
			for (int i=0; i<tam/2 && palindroma; i++) 
				if(filtrado[i]!=filtrado[tam-i-1]) palindroma=false;

			String rta=(palindroma)?"You won't be eaten!":"Uh oh..";
			System.out.println(rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
