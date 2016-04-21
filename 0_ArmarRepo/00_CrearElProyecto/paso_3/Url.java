import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Url
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(String line, url; (line=br.readLine())!=null;)
		{
			url="https://uva.onlinejudge.org/external/";
			if(line.length()<=3) url+=(line.charAt(0)+"/"+line+".pdf");
			else if(line.length()==4) url+=(line.substring(0,2)+"/"+line+".pdf");
			else url+=(line.substring(0,3)+"/"+line+".pdf");
			System.out.println(url);			
		}
		
		br.close();
	}
}
