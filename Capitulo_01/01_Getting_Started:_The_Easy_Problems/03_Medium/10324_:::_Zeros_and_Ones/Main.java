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
		int c=1, casos, a, b, init, fin;
		boolean iguales;
		char anterior, leido[];
		for(String linea, aux[]; (linea=br.readLine())!=null;)
		{
			System.out.println("Case "+(c++)+":");
			casos=Integer.parseInt(br.readLine());
			leido=linea.toCharArray();

			while(casos--!=0)
			{
				aux=br.readLine().split(" ");
				a=Integer.parseInt(aux[0]);
				b=Integer.parseInt(aux[1]);
				init=Math.min(a, b);
				fin=Math.max(a, b);

				anterior=leido[init];
				iguales=true;
				for(int i=init+1; i<=fin && iguales; i++)
				{
					if(anterior!=leido[i]) iguales=false;
					anterior=leido[i];
				}
				System.out.println(iguales?"Yes":"No");
			}
		}
		//-----------------------------------------------------------
		br.close();
	}
}
