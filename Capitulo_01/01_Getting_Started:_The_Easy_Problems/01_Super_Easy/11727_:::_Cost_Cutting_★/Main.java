import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("in.txt")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int casos=Integer.parseInt(br.readLine());
		List<Integer> lol=new ArrayList<Integer>();
		String[] param;

		for(int c=1; c<=casos; c++)
		{
			param=br.readLine().split(" ");
			for(String string : param) lol.add(Integer.parseInt(string));
			Collections.sort(lol);
			System.out.println("Case "+c+": "+lol.get(1));
			lol.clear();
		}
		//-----------------------------------------------------------
		br.close();
	}
}
