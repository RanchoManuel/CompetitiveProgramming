import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.Desktop;

public class Main
{
	private static Desktop dt = Desktop.getDesktop();
	
	public static void main(String[] args) throws IOException
	{
		File folder=new File("../../");
		recursion(folder);
	}
	
	public static void recursion(File nodo) throws IOException
	{
		if(!nodo.isFile())
		{
			File[] contenido = nodo.listFiles();
			
			for(File hijo: contenido) if(!hijo.getName().equals("0_ArmarRepo")) recursion(hijo); //Dfs	
		}
		else
		{
			String name=nodo.getName();
			if(name.endsWith(".c") || name.endsWith(".cpp") || name.endsWith(".java") || name.endsWith(".sh"))
			{
				Path nameOriginal=nodo.toPath();
				File conCambios=new File(nodo.getAbsolutePath().replace(nodo.getName(), "") + "auxiliar"); 
				
				BufferedReader br=new BufferedReader(new FileReader(nodo));
				PrintWriter pw=new PrintWriter(conCambios);
				
				for(String line; (line=br.readLine())!=null;)
				{
					if(name.endsWith(".c") && !line.contains("if(test) freopen(\"in.txt\",\"r\",stdin);") && !line.contains("int test=1;"))
						pw.println(line);
					else if(name.endsWith(".cpp") && !line.contains("if(test) freopen(\"in.txt\",\"r\",stdin);") && !line.contains("bool test=true;"))
						pw.println(line);
					else if(name.endsWith(".java"))
					{
						if(line.contains("else br=new BufferedReader(new InputStreamReader(System.in));"))
							pw.println("\t\tBufferedReader br=new BufferedReader(new InputStreamReader(System.in));");
						else if(!line.contains("if(test) br=new BufferedReader(new FileReader(new File(\"in.txt\")));") && !line.contains("private static boolean test=true;") && !line.contains("private static BufferedReader br;"))
							pw.println(line);
					}
					else if(name.endsWith(".sh"))
					{
						if(line.contains("java Main"))pw.println("java Main < in.txt");
						else if(line.contains("./MainC"))pw.println("./MainC < in.txt");
						else if(line.contains("./MainCpp"))pw.println("./MainCpp < in.txt");
						else pw.println(line);
					}
				}
				br.close(); pw.close();
				
				Files.deleteIfExists(nodo.toPath());
				Files.move(conCambios.toPath(), nameOriginal);
				if(nodo.getAbsolutePath().contains("02_Easy"))dt.open(nodo);
			}
		}
	}
}
