import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("in.txt")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int casos=Integer.parseInt(br.readLine()), W, y1, y2, diff=0;
		boolean rta, primero;
		
		for(String[] aux; casos--!=0;)
		{
			br.readLine();
			W=Integer.parseInt(br.readLine());
			
			rta=primero=true;
			while(W--!=0)
			{
				aux=br.readLine().split("\\s+");
				y1=Integer.parseInt(aux[0]);
				y2=Integer.parseInt(aux[1]);
				
				if(primero)
				{
					diff=y1-y2;
					primero=false;
				}
				else if(y1-y2!=diff) rta=false;
			}
			System.out.println(rta?"yes":"no");
			if(casos>0) System.out.println();
		}
		//-----------------------------------------------------------
		br.close();
	}
}
