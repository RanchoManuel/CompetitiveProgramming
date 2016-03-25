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
		String linea, rta;
		for(int c=1; !(linea=br.readLine()).equals("#"); c++)
		{
			if(linea.contains("HELLO"))rta="ENGLISH";
			else if(linea.contains("HOLA"))rta="SPANISH";
			else if(linea.contains("HALLO"))rta="GERMAN";
			else if(linea.contains("BONJOUR"))rta="FRENCH";
			else if(linea.contains("CIAO"))rta="ITALIAN";
			else if(linea.contains("ZDRAVSTVUJTE"))rta="RUSSIAN";
			else rta="UNKNOWN";

			System.out.println("Case "+c+": "+rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
