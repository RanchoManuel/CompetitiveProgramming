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
		int caso=1, n, m, c, mpc, max, lect;
		for(String linea, aux[]; !(linea=br.readLine()).equals("0 0 0"); caso++)
		{
			aux=linea.split(" ");
			n=Integer.parseInt(aux[0]);
			m=Integer.parseInt(aux[1]);
			c=Integer.parseInt(aux[2]);

			int[][] amp=new int[n][2];
			mpc=max=0;

			for(int i=0; i<n; i++)
			{
				amp[i][0] = Integer.parseInt(br.readLine());
				amp[i][1] = 0;
			}

			while(m--!=0)
			{
				lect=Integer.parseInt(br.readLine())-1;
				if(amp[lect][1] == 0)
				{
					mpc += amp[lect][0];
					amp[lect][1] = 1;
				}
				else
				{
					mpc -= amp[lect][0];
					amp[lect][1] = 0;
				}
				if(max < mpc) max = mpc;
			}

			System.out.println("Sequence "+caso);
			if(max > c) System.out.println("Fuse was blown.");
			else
			{
				System.out.println("Fuse was not blown.");
				System.out.println("Maximal power consumption was "+max+" amperes.");
			}
			System.out.println();
		}
		//-----------------------------------------------------------
		br.close();
	}
}
