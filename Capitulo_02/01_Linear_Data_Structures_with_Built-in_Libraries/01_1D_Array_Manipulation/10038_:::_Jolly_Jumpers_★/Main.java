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
		int nums[], n, necesarios[], dif;
		for(String linea, aux[]; (linea=br.readLine())!=null;)
		{
			aux=linea.split(" ");
			n=Integer.parseInt(aux[0]);
			nums=new int[n];
			necesarios=new int[n];
			
			for(int i=0; i<n; i++)
			{
				nums[i]=Integer.parseInt(aux[i+1]);
				if(i>0)
				{
					dif=Math.abs(nums[i]-nums[i-1]);
					if(dif<n) necesarios[dif]++;
				}
			}
			
			boolean jolly=true;
			for(int i=1; i<n; i++)
			{
				if(necesarios[i]==0)
				{
					jolly=false;
					break;
				}
			}

			System.out.println(jolly?"Jolly":"Not jolly");
		}
		//-----------------------------------------------------------
		br.close();
	}
}
