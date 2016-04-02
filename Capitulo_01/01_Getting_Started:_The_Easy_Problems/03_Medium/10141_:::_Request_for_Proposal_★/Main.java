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
		String empresa;
		int numRequisitos, numEmpresas, maxReqsCumplidos, numReqsCumplidos, c=1;
		double precio, menorPrecio;
		ArrayList<Propuesta> primerFiltro, segundoFiltro;

		for(String linea, aux[]; !(linea=br.readLine()).equals("0 0"); c++)
		{
			if(c>1) System.out.println();

			aux=linea.split(" ");
			numRequisitos=Integer.parseInt(aux[0]);
			numEmpresas=Integer.parseInt(aux[1]);

			for(int i=0; i<numRequisitos; i++) br.readLine();

			ArrayList<Propuesta> proEmpresas=new ArrayList<Propuesta>();
			maxReqsCumplidos=0;
			for(int i=0; i<numEmpresas; i++)
			{
				empresa=br.readLine();
				aux=br.readLine().split(" ");
				precio=Double.parseDouble(aux[0]);
				numReqsCumplidos=Integer.parseInt(aux[1]);

				if(numReqsCumplidos>maxReqsCumplidos) maxReqsCumplidos=numReqsCumplidos;

				for(int j=0; j<numReqsCumplidos; j++)br.readLine();

				proEmpresas.add(new Propuesta(empresa,precio,numReqsCumplidos));
			}

			primerFiltro=new ArrayList<Propuesta>();
			menorPrecio=Double.POSITIVE_INFINITY;

			for(Propuesta propuesta : proEmpresas)
			{
				if(propuesta.numReqsCumplidos==maxReqsCumplidos)
				{
					primerFiltro.add(propuesta);
					if(propuesta.precio<menorPrecio) menorPrecio=propuesta.precio;
				}
			}

			segundoFiltro=new ArrayList<Propuesta>();
			for(Propuesta propuesta : primerFiltro)
				if(propuesta.precio==menorPrecio) segundoFiltro.add(propuesta);

			System.out.println("RFP #"+c);
			System.out.println(segundoFiltro.get(0).empresa);
		}
		//-----------------------------------------------------------
		br.close();
	}

	private static class Propuesta
	{
		String empresa;
		Double precio;
		int numReqsCumplidos;

		public Propuesta(String empresaP, Double precioP, int numReqsCumplidosP)
		{
			empresa=empresaP;
			precio=precioP;
			numReqsCumplidos=numReqsCumplidosP;
		}
	}
}
