import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		DecimalFormat df=new DecimalFormat("0.00$");
		int casos=Integer.parseInt(br.readLine()), cantChar, cantLine;
		Map<Character, Long> map = new HashMap<Character, Long>();
		double rta;
		String line, aux[];
		char[] caract;

		while(casos--!=0)
		{
			rta=0;
			map.clear();
			
			cantChar=Integer.parseInt(br.readLine().trim());
			while(cantChar--!=0)
			{
				line=br.readLine();
				aux=line.split("\\s+");
				map.put(line.charAt(0), Long.parseLong(aux[1]));				
			}
			
			cantLine=Integer.parseInt(br.readLine().trim());
			while(cantLine--!=0)
			{
				caract=br.readLine().toCharArray();
				for(Character c: caract)
					if(map.containsKey(c))
						rta+=map.get(c);
			}
			
			rta/=100.0;
			System.out.println(df.format(rta));
		}
		//-----------------------------------------------------------
		br.close();
	}
}
