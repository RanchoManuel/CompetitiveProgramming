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
		int rta;
		for(String line, newLine; !(line=br.readLine()).equals("END");)
		{
			for(rta=1; true; rta++)
			{
				newLine=line.length()+"";
				if(newLine.equals(line)) break;
				line=newLine;
			}
			
			System.out.println(rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
