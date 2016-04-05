import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		DecimalFormat df=new DecimalFormat("0.00");
		char[] aux1, aux2;
		int sum1, sum2;
		double rta;

		for(String nombre1, cad1, cad2; (nombre1=br.readLine())!=null;)
		{
			sum1=sum2=0;
			aux1=nombre1.toCharArray();
			for(char c : aux1) if(Character.isLetter(c)) sum1+=(Character.toLowerCase(c)-'a'+1);

			aux2=br.readLine().toCharArray();
			for(char c : aux2) if(Character.isLetter(c)) sum2+=(Character.toLowerCase(c)-'a'+1);

			cad1=sum1+""; cad2=sum2+"";

			while(cad1.length()!=1)
			{
				sum1=0;
				aux1=cad1.toCharArray();
				for(char c : aux1) sum1+=(c-'0');
				cad1=sum1+"";
			}

			while(cad2.length()!=1)
			{
				sum2=0;
				aux2=cad2.toCharArray();
				for(char c : aux2) sum2+=(c-'0');
				cad2=sum2+"";
			}

			rta=Math.min(sum1, sum2)*100.0/Math.max(sum1, sum2);
			System.out.println(df.format(rta).replace(',','.')+" %");
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
