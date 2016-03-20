import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("in.txt")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int ans, p0, p1, p2, p3, ang1, ang2, ang3, i;
		
		for(String linea, aux[]; !(linea=br.readLine()).equals("0 0 0 0");)
		{
			ans=1080;
			aux=linea.split(" ");
			p0=Integer.parseInt(aux[0]);
			p1=Integer.parseInt(aux[1]);
			p2=Integer.parseInt(aux[2]);
			p3=Integer.parseInt(aux[3]);

			ang1=ang2=ang3=0;
			for(i=p1; i!=p0; i=(i+1)%40) ang1++;
			for(i=p2; i!=p1; i=(i+39)%40) ang2++;
			for(i=p3; i!=p2; i=(i+1)%40) ang3++;

			ans+=((ang1+ang2+ang3)*9);

			System.out.println(ans);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
