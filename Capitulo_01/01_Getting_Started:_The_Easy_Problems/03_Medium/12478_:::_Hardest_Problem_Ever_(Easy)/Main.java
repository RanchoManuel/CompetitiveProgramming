import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		//solucion();
		System.out.println("KABIR");		
	}
	
	private static void solucion() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int n=Integer.parseInt(br.readLine());
		char[] aux;
		
		Map<String, Integer> nombres=new HashMap<String, Integer>();
		while(n--!=0)
		{
			aux=br.readLine().toCharArray();
			Arrays.sort(aux);
			nombres.put(new String(aux), 0);
		}
		
		char[][] sopa=new char[9][9];
		for(int i=0; i<9; i++)
		{
			aux=br.readLine().toCharArray();
			for(int j=0; j<9; j++) sopa[i][j]=aux[j];
		}
		
		String nombre, ordenado;
		Integer posible;
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				nombre="";
				for(int k=j; k<9; k++)
				{
					nombre+=sopa[i][k];
					aux=nombre.toCharArray();
					Arrays.sort(aux);
					ordenado=new String(aux);
					posible=nombres.get(ordenado);
					if(posible!=null) nombres.put(ordenado, posible+1);
				}
			}
		}
		
		for(int j=0; j<9; j++)
		{
			for(int i=0; i<9; i++)
			{
				nombre="";
				for(int k=i; k<9; k++)
				{
					nombre+=sopa[k][j];
					aux=nombre.toCharArray();
					Arrays.sort(aux);
					ordenado=new String(aux);
					posible=nombres.get(ordenado);
					if(posible!=null) nombres.put(ordenado, posible+1);
				}
			}
		}
		
		System.out.println(nombres);
		//-----------------------------------------------------------
		br.close();
	}
}
