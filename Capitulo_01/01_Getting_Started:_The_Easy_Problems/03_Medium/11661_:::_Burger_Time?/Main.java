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
		int L, rta, lastR, lastD
		char[] calle;
		
		while((L=Integer.parseInt(br.readLine()))!=0)
		{
			rta=L;
			lastR=lastD=-1;
			calle=br.readLine().toCharArray();
			
			for(int i=0; i<calle.length; i++)
			{
				if(calle[i]=='Z')
				{
					rta=0;
					break;
				}
				else if(calle[i]=='D')
				{
					lastD=i;
					if(lastR!=-1)
						rta=Math.min(rta, Math.abs(lastD-lastR));
				}
				else if(calle[i]=='R')
				{
					lastR=i;
					if(lastD!=-1)
						rta=Math.min(rta, Math.abs(lastD-lastR));
				}
			}
			
			System.out.println(rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
