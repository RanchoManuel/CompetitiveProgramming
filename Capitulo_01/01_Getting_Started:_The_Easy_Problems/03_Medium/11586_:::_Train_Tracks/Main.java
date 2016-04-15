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
		int casos=Integer.parseInt(br.readLine()), males[], females[], n;
		boolean rta;
		
		for(String[] aux; casos--!=0;)
		{
			aux=br.readLine().split("\\s+");
			n=aux.length;
			males=new int[n];
			females=new int[n];
			
			for(int i=0; i<n; i++)
			{
				if(aux[i].charAt(0)=='M') males[i]++;
				else females[i]++;
				
				if(aux[i].charAt(1)=='M') males[i]++;
				else females[i]++;
			}
			
			for(int i=0; i<n; i++)
			{
				for(int j=(i+1)%n; i!=j; j=(j+1)%n)
				{
					if(males[i]==0) break;
					else
					{
						if(males[i]>=females[j])
						{
							males[i]-=females[j];
							females[j]=0;
						}
						else
						{
							females[j]-=males[i];
							males[i]=0;
						}
					}
				}
			}
			
			rta=true;
			for(int i=0; i<n && rta; i++)
				if(males[i]>0 || females[i]>0) rta=false;
			
			System.out.println(rta?"LOOP":"NO LOOP");
		}
		//-----------------------------------------------------------
		br.close();
	}
}
