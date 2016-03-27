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
		int numParticip, budget, numHoteles, minGasto, precio, gasto;
		String[] paramEvento, camasDisp;

		for(String linea; (linea=br.readLine())!=null;)
		{
			paramEvento=linea.split(" ");
			numParticip=Integer.parseInt(paramEvento[0]);
			budget=Integer.parseInt(paramEvento[1]);
			numHoteles=Integer.parseInt(paramEvento[2]);
			minGasto=-1;

			while(numHoteles--!=0)
			{
				precio=Integer.parseInt(br.readLine());
				camasDisp=br.readLine().split(" ");

				gasto=precio*numParticip;
				for(String camas : camasDisp)
				{
					int beds=Integer.parseInt(camas);
					if(gasto<=budget && beds>=numParticip && (gasto<minGasto||minGasto==-1)) minGasto=gasto;
				}
			}

			String rta=(minGasto==-1)?"stay home":minGasto+"";
			System.out.println(rta);
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
