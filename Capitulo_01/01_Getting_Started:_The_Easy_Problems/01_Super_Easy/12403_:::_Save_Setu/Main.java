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
		int casos=Integer.parseInt(br.readLine()), total=0;
		String[] comando;

		while(casos--!=0)
		{
			comando=br.readLine().split(" ");
			if(comando[0].equals("donate")) total+=Integer.parseInt(comando[1]);
			else System.out.println(total);
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
