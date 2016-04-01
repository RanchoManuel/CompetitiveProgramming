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
		int casos=Integer.parseInt(br.readLine()), n, inst[]=new int[100], s, rta;
		
		for(String line; casos--!=0;)
		{
			rta=0;
			n=Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++)
			{
				line=br.readLine();
				if(line.equals("LEFT")) {inst[i]=-1; rta--;}
				else if(line.equals("RIGHT")) {inst[i]=1; rta++;}
				else
				{
					s=Integer.parseInt(line.split(" ")[2])-1;
					inst[i]=inst[s];
					
					rta+=inst[i];
				}
			}
			System.out.println(rta);
		} 
		//-----------------------------------------------------------
		br.close();
	}
}
