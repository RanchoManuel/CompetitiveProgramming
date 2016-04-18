import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time_Limit
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int A, C, alt, rta;
		boolean mat[][], ant;
		
		for(String line, aux[]; !(line=br.readLine()).equals("0") && !(line).equals("0 0");)
		{
			aux=line.split("\\s+");
			A=Integer.parseInt(aux[0]);
			C=Integer.parseInt(aux[1]);
			mat=new boolean[A][C];
			
			aux=br.readLine().split("\\s+");
			for(int j=0; j<C; j++)
			{
				alt=Integer.parseInt(aux[j]);
				for(int k=0; k<A-alt; k++) mat[k][j]=true;				
			}
			
			rta=0;
			for(int i=0; i<A; i++)
			{
				ant=mat[i][0];
				for(int j=0; j<C; j++)
				{
					if(!mat[i][j] && (mat[i][j]!=ant) rta++;
					ant=mat[i][j];				
				}
				if(mat[i][C-1]) rta++;
			}
			
			System.out.println(rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
