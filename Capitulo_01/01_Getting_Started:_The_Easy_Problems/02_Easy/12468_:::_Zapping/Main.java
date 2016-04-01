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
		int a, b;
		for(String line, aux[]; !(line=br.readLine()).equals("-1 -1");)
		{
			aux=line.split(" ");
			a=Integer.parseInt(aux[0]);
			b=Integer.parseInt(aux[1]);
			System.out.println(Math.min(Math.abs(a-b), Math.min(a,b)+100-Math.max(a,b)));
		}
		//-----------------------------------------------------------
		br.close();
	}
}
