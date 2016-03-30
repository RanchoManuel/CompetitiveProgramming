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
		int B, N, R[], D, C, V;
		boolean rta;
		for(String line, aux[]; !(line=br.readLine()).equals("0 0");)
		{
			aux=line.split("\\s+");
			B=Integer.parseInt(aux[0]);
			N=Integer.parseInt(aux[1]);
			
			R=new int[B];
			
			aux=br.readLine().split("\\s+");
			for(int i=0; i<aux.length; i++) R[i]=Integer.parseInt(aux[i]);
			
			rta=true;
			while(N--!=0)
			{
				aux=br.readLine().split("\\s+");
				D=Integer.parseInt(aux[0])-1;
				C=Integer.parseInt(aux[1])-1;
				V=Integer.parseInt(aux[2]);
				
				R[C]+=V;
				R[D]-=V;
			}
			
			for(int r : R)
			{
				if(r<0)
				{
					rta=false;
					break;
				}
			}
			System.out.println(rta?"S":"N");			
		}
		//-----------------------------------------------------------
		br.close();
	}
}
