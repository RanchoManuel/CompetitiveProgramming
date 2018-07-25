import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			for (String line, aux[]; (line=br.readLine())!=null;) {
				// aux = line.split("\\s+");
				System.out.println(line);
			}
		}
	}
}
