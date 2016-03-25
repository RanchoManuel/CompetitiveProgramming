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
		int casos=Integer.parseInt(br.readLine()), L, W, H;
		String[] aux;

		for(int c=1; c<=casos; c++)
		{
			aux=br.readLine().split(" ");
			L=Integer.parseInt(aux[0]);
			W=Integer.parseInt(aux[1]);
			H=Integer.parseInt(aux[2]);

			System.out.print("Case "+c+": ");
			if(L<=20 && W<=20 && H<=20) System.out.println("good");
			else System.out.println("bad");
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
