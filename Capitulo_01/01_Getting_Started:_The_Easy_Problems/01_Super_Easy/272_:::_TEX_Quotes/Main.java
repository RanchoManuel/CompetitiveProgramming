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
		String linea=br.readLine();
		int cont=0;
		char[] aux;
		String resp;

		while(linea!=null)
		{
			aux=linea.toCharArray();
			resp="";
			for(char c : aux)
			{
				if(c=='"') resp+=(cont++%2==0)?"``":"''";
				else resp+=c;
			}
			System.out.println(resp);
			linea=br.readLine();
		}
		//-----------------------------------------------------------
		br.close();
	}
}
