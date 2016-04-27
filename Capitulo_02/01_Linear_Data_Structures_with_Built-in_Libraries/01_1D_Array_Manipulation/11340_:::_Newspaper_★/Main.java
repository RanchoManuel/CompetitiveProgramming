import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		DecimalFormat df=new DecimalFormat("0.00$");
		int casos=Integer.parseInt(br.readLine()), cantChar, cantLine, map[]=new int[256];
		double rta;
		String line, aux[];
		char[] caract;

		while(casos--!=0)
		{
			rta=0;
			Arrays.fill(map, 0);
			
			cantChar=Integer.parseInt(br.readLine().trim());
			while(cantChar--!=0)
			{
				line=br.readLine();
				aux=line.split("\\s+");
				map[line.charAt(0)]=Integer.parseInt(aux[1]);				
			}
			
			cantLine=Integer.parseInt(br.readLine().trim());
			while(cantLine--!=0)
			{
				caract=br.readLine().toCharArray();
				for(char c: caract) rta+=map[c];
			}
			
			rta/=100.0;
			System.out.println(df.format(rta));
		}
		//-----------------------------------------------------------
		br.close();
	}
}
