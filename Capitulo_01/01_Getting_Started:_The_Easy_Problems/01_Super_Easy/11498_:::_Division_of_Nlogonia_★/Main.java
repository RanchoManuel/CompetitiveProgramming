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
		int numPuntos, x, y, xp, yp;

		for(String puntoCentro[], estePunto[]; (numPuntos=Integer.parseInt(br.readLine()))!=0;)
		{
			puntoCentro=br.readLine().split(" ");
			x=Integer.parseInt(puntoCentro[0]); y=Integer.parseInt(puntoCentro[1]);

			while(numPuntos--!=0)
			{
				estePunto=br.readLine().split(" ");
				xp=Integer.parseInt(estePunto[0]);
				yp=Integer.parseInt(estePunto[1]);

				if(xp==x||yp==y)System.out.println("divisa");
				else if(xp>x&&yp>y)System.out.println("NE");
				else if(xp<x&&yp>y)System.out.println("NO");
				else if(xp<x&&yp<y)System.out.println("SO");
				else if(xp>x&&yp<y)System.out.println("SE");
			}
		}
		//-----------------------------------------------------------
		br.close();
	}
}
