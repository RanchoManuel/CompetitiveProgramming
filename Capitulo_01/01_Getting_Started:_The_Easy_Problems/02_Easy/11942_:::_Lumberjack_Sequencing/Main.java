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
		int casos=Integer.parseInt(br.readLine().trim());
		int[] largoBarbas=new int[10];
		boolean sortUp, sortDown;
		System.out.println("Lumberjacks:");

		for(String[] aux ;casos--!=0;)
		{
			sortUp=sortDown=true;
			aux=br.readLine().split(" ");

			largoBarbas[0]=Integer.parseInt(aux[0]);
			for(int i=1, j=0; i<aux.length; i++, j++)
			{
				largoBarbas[i]=Integer.parseInt(aux[i]);
				if(largoBarbas[i]>largoBarbas[j]) sortDown=false;
				else if(largoBarbas[i]<largoBarbas[j]) sortUp=false;
			}
			System.out.println(sortUp||sortDown?"Ordered":"Unordered");
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
