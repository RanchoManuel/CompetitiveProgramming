import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int casos=Integer.parseInt(br.readLine()), pointer, mem[]=new int[100];
		char inst[];
		String aux;
		
		for(int c=1; c<=casos; c++)
		{
			Arrays.fill(mem, 0);
			pointer=0;
			inst=br.readLine().toCharArray();
			for(char ch: inst)
			{
				if(ch=='>') 		pointer=(pointer+1)%100;
				else if(ch=='<') pointer=(pointer+100-1)%100;
				else if(ch=='+') mem[pointer]=(mem[pointer]+1)%256;
				else if(ch=='-') mem[pointer]=(mem[pointer]+256-1)%256;
				else if(ch=='.');
			}

			System.out.printf("Case %d:", c);
			for(int i=0; i<mem.length; i++)
			{
				System.out.print(" ");
				aux=Integer.toHexString(mem[i]).toUpperCase();
				aux=aux.length()>1?aux:"0"+aux;
				System.out.print(aux);
			}
			System.out.println();
		}
		//-----------------------------------------------------------
		br.close();
	}
}
