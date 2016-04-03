import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	private static int map [][]={{-1,-1,2,3,4,5},
								 {-1,-1,3,2,5,4},
								 {-1,-1,1,0,2,2},
								 {-1,-1,0,1,3,3},
								 {-1,-1,4,4,1,0},
								 {-1,-1,5,5,0,1}};

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int pos;

		for(String linea, instrucciones[]; !(linea=br.readLine()).equals("0");)
		{
			instrucciones=br.readLine().split(" ");

			pos=0;
			for(String instruc : instrucciones)
				if(!instruc.equals("No")) pos=map[pos][map_l_n(instruc)];

			System.out.println(map_n_l(pos));
		}
		//-----------------------------------------------------------
		br.close();
	}

	private static int map_l_n(String l)
	{
		if(l.equals("+x")) return 0;
		else if(l.equals("-x")) return 1;
		else if(l.equals("+y")) return 2;
		else if(l.equals("-y")) return 3;
		else if(l.equals("+z")) return 4;
		else return 5;
	}

	private static String map_n_l(int n)
	{
		if(n==0)return "+x";
		else if(n==1)return "-x";
		else if(n==2)return "+y";
		else if(n==3)return "-y";
		else if(n==4)return "+z";
		else return "-z";
	}
}
