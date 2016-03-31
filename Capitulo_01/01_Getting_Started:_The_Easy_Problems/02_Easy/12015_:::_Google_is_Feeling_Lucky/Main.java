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
		int casos=Integer.parseInt(br.readLine()), max, V[]=new int[10];
		String[] urls=new String[10], aux;
		
		for(int c=1; c<=casos; c++)
		{
			max=0;
			for(int i=0; i<10; i++)
			{
				aux=br.readLine().split("\\s+");
				urls[i]=aux[0];
				V[i]=Integer.parseInt(aux[1]);
				if(V[i]>max) max=V[i];
			}
			
			System.out.println("Case #"+c+":");
			for(int i=0; i<10; i++)
				if(V[i]==max)
					System.out.println(urls[i]);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
