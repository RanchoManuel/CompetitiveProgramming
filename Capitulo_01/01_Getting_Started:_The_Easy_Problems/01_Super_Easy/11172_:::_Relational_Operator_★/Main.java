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
		int casos=Integer.parseInt(br.readLine()), a, b;
		for(String aux[]; casos--!=0;)
		{
			aux=br.readLine().split(" ");
			a=Integer.parseInt(aux[0]);
			b=Integer.parseInt(aux[1]);

			if(a<b) System.out.println("<");
			else if(a>b) System.out.println(">");
			else System.out.println("=");
		}
		//-----------------------------------------------------------
		br.close();
	}
}
