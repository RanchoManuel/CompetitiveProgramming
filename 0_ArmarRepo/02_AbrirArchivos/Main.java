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
			if(name.endsWith(".sh"))
			{
				if(nodo.getAbsolutePath().contains("02_Easy") || nodo.getAbsolutePath().contains("01_Super_Easy"))
					dt.open(nodo);
			}
		}
	}
}
