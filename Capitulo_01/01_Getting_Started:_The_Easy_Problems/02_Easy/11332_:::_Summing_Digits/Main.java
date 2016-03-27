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
		for(String linea; !(linea=br.readLine()).equals("0");)
			{
				char[] caract=linea.toCharArray();
				while(caract.length>1)
				{
					int f=0;
					for(int i=0; i<caract.length; i++) f+=(caract[i]-'0');
					caract=(""+f).toCharArray();
				}
				System.out.println(caract[0]);
			}
		//-----------------------------------------------------------
		br.close();
	}
}
