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
		int casos=Integer.parseInt(br.readLine()), N, mile, juice;
		double estaCall;
		String aux[], rta="";
		
		for(int c=1; c<=casos; c++)
		{
			mile=juice=0;
			N=Integer.parseInt(br.readLine());
			aux=br.readLine().split("\\s+");
			
			for(int i=0; i<N; i++) 
			{
				estaCall=Double.parseDouble(aux[i]);
				mile +=Math.ceil(estaCall/30.0)*10+((estaCall%30==0)?10:0);
				juice+=Math.ceil(estaCall/60.0)*15+((estaCall%60==0)?15:0);
			}
			
			rta = (mile<juice)?"Mile "+mile : (mile>juice)?"Juice "+juice :"Mile Juice "+mile;
			System.out.println("Case "+c+": "+rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
