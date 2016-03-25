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
		int casos=Integer.parseInt(br.readLine());

		for(String exp; casos-- != 0;)
		{
			exp=br.readLine();
			if(exp.equals("1") || exp.equals("4") || exp.equals("78")) System.out.println("+");
			else if(exp.endsWith("35")) System.out.println("-");
			else if(exp.startsWith("9") && exp.endsWith("4")) System.out.println("*");
			else if(exp.startsWith("190")) System.out.println("?");
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
