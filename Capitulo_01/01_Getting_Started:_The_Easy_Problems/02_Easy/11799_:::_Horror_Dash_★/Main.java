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
		int casos=Integer.parseInt(br.readLine()), max, vel;
		String[] param;

		for(int c=1; c<=casos ; c++)
		{
			param=br.readLine().split(" ");
			max=0;
			for(int i=1; i<param.length; i++)
			{
				vel=Integer.parseInt(param[i]);
				if(vel>max) max=vel;
			}
			System.out.println("Case "+c+": "+max);
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
