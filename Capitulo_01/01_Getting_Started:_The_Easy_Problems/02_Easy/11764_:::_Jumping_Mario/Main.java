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
		int casos=Integer.parseInt(br.readLine()), subidas, bajadas;
		for(int c=1; c<=casos; c++)
		{
			subidas=bajadas=0;
			br.readLine();
			String[] aux=br.readLine().split(" ");

			int ant=Integer.parseInt(aux[0]);
			for(int j=1; j<aux.length ; j++)
			{
				int actual=Integer.parseInt(aux[j]);
				if(ant>actual) bajadas++;
				else if(ant<actual) subidas++;
				ant=actual;
			}
			System.out.println("Case "+c+": "+subidas+" "+bajadas);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
