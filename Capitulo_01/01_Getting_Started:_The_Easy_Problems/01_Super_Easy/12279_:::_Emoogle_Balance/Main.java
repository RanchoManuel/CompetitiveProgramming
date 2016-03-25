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
		int numMax=Integer.parseInt(br.readLine().trim()), numCeros=0;

		for(int c=1; numMax!=0 ; c++)
		{
			numCeros=0;
			String[] caso=br.readLine().trim().split(" ");
			for(String cadena : caso) if(cadena.equals("0")) numCeros++;

			System.out.println("Case "+c+": "+(numMax-(2*numCeros)));
			numMax=Integer.parseInt(br.readLine().trim());
		}
		//-----------------------------------------------------------
		br.close();
	}
}
