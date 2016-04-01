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
		String[] song="Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you".split(" ");
		
		int n=Integer.parseInt(br.readLine());
		String[] family=new String[n];
		for(int i=0; i<n; i++) family[i]=br.readLine();
		
		if(n <= 16)
			for(int i=0; i<16; i++)
				System.out.println(family[i%n]+": "+song[i]);
		else
		{
			int reps=(int)Math.ceil(n/16.0);
			for(int i=0; i<reps; i++)
				for(int j=0; j<16; j++)
					System.out.println(family[(i*16+j)%n]+": "+song[j]);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
