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
		int meses, numIntereses, mesInteres, anteriorMes, t=0;
		double down, deuda, pago, precioCarro, interes, anteriorInteres;
		double[] depreciacionPeriodo=new double[101];

		for(String line, aux[], auxRta; !(line=br.readLine()).startsWith("-");)
		{
			//Agarro los datos basicos
			aux=line.split(" ");
			meses=Integer.parseInt(aux[0]);
			down=Double.parseDouble(aux[1]);
			deuda=Double.parseDouble(aux[2]);
			precioCarro=deuda+down;
			pago=deuda/meses;
			numIntereses=Integer.parseInt(aux[3])-1;//-1, porque el primero lo cojo hardcore

			//Primer dato, Hardcore
			aux=br.readLine().split(" ");
			mesInteres=Integer.parseInt(aux[0]);
			interes=Double.parseDouble(aux[1]);
			precioCarro=precioCarro*(1-interes);
			depreciacionPeriodo[0]=interes;//No lo uso, esa por claridad

			//Agarro la informacion de la depreciacion de cada periodo
			for(anteriorInteres=interes, anteriorMes=0; numIntereses--!=0; anteriorInteres=interes, anteriorMes=mesInteres)
			{
				aux=br.readLine().split(" ");
				mesInteres=Integer.parseInt(aux[0]);
				interes=Double.parseDouble(aux[1]);

				for(int i=mesInteres-1; i>=anteriorMes; i--) depreciacionPeriodo[i]=anteriorInteres;
			}
			for(int i=meses; i>=anteriorMes; i--) depreciacionPeriodo[i]=anteriorInteres;

			//Inicio la simulacion
			for(t=0; t<=meses; t++)
			{
				if(t>0)
				{
					deuda-=pago;
					precioCarro=precioCarro*(1-depreciacionPeriodo[t]);
				}
				//System.out.printf("t:%d   deuda:%f   precio:%f\n", t, deuda, precioCarro);
				if(deuda<precioCarro)	break;
			}

			//Escribo respuesta
			auxRta=(t==1)?"month":"months";
			System.out.printf("%d %s\n", t, auxRta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
