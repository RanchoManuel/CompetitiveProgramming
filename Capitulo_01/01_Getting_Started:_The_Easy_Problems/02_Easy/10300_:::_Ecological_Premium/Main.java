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
		int casos=Integer.parseInt(br.readLine());

		while(casos--!=0)
		{
			int granjas=Integer.parseInt(br.readLine()), rta=0;
			while(granjas--!=0)
			{
				String[] aux=br.readLine().split(" ");
				int size=Integer.parseInt(aux[0]);
				int environment=Integer.parseInt(aux[2]);

				rta+=(size*environment);
			}
			System.out.println(rta);
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
