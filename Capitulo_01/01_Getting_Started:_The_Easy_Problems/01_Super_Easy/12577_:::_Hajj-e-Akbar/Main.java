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
		String linea;

		for(int c=1; !(linea=br.readLine()).equals("*"); c++)
		{
			System.out.print("Case "+c+": ");
			if(linea.equals("Hajj")) System.out.println("Hajj-e-Akbar");
			else System.out.println("Hajj-e-Asghar");
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
