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
		char[] one={'o','n','e'}, letras;
		int casos=Integer.parseInt(br.readLine()), num1=0;

		while(casos--!=0)
		{
			letras=br.readLine().toCharArray();

			if(letras.length==5) System.out.println(3);
			else
			{
				num1=0;
				for(int j=0; j<letras.length; j++) if(letras[j]==one[j]) num1++;
				if(num1>=2) System.out.println(1);
				else System.out.println(2);
			}
		}
		//-----------------------------------------------------------
		br.close();
	}
}
