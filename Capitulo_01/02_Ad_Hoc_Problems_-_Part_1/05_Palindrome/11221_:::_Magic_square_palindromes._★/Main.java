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
		int casos=Integer.parseInt(br.readLine()), lado;
		char[] linea, letras;
		double aux;
		boolean palindromo;
		String filtro1, pal1, pal2, pal3, pal4;
		char[][] matriz;
		
		for(int cs=1; cs<=casos ; cs++)
		{
			filtro1="";
			linea=br.readLine().toCharArray();
			for(char c : linea)
				if(c>=97 && c<=122)
					filtro1+=c;

			letras=filtro1.toCharArray();
			aux=Math.sqrt(filtro1.length());
			lado=(int)aux;
			palindromo=true;
			
			if(aux%1==0)
			{
				matriz=new char[lado][lado];

				for (int i=0; i<lado; i++)
					for (int j=0; j<lado; j++)
						matriz[i][j]=letras[(i*lado)+j];

				for (int i=0; i<lado && palindromo; i++) 
				{
					pal1=pal2=pal3=pal4="";
					for (int j=0; j<lado ; j++) 
					{
						pal1+=matriz[i][j];
						pal2+=matriz[j][i];
						pal3+=matriz[lado-i-1][lado-j-1];
						pal4+=matriz[lado-j-1][lado-i-1];
					}
					if(!pal1.equals(pal2) || !pal2.equals(pal3) || !pal3.equals(pal4)) palindromo=false;
				}
			}
			else palindromo=false;
			
			System.out.println("Case #"+cs+":");
			String rta=(palindromo)?""+lado:"No magic :(";
			System.out.println(rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
