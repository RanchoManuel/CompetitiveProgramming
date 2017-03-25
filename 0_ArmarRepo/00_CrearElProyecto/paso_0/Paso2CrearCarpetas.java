import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Paso2CrearCarpetas
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter prNums=new PrintWriter(new File("numeros.txt"));
		PrintWriter prRuta=new PrintWriter(new File("rutas.txt"));

		String folderH1="", folderH2="", problem="", capitulo=br.readLine();
		int numH1=1, numH2=1;
		for(String line, procesada; (line=br.readLine())!=null;)
		{
			//Estos son los Titulos principales (acaban en un porcantaje)
			if(line.matches(".*\\([0-9]*/[0-9]* = [0-9]*%\\).*"))
			{
				procesada=line.substring(0, line.lastIndexOf('(')).trim().replaceAll(" ", "_");
				folderH1=String.format("%02d_", numH1++)+procesada;
				numH2=1;
				System.out.println(procesada);
			}
			//Estos son titulos secunddarios (acaban en una fraccion)
			else if(line.matches(".*\\([0-9]*/[0-9]*\\).*"))
			{
				procesada=line.substring(0, line.lastIndexOf('(')).trim().replaceAll(" ", "_");
				folderH2=String.format("%02d_", numH2++)+procesada;
				System.out.println("\t"+procesada);

			}
			//Estos son los problemas
			else if(line.matches("[0-9]* ::: .*"))
			{
				procesada=line.trim().replaceAll(" ", "_");
				problem=procesada;
				String ruta=capitulo+"/"+folderH1+"/"+folderH2+"/"+problem;
				
				prNums.println(line.split("\\s+:::\\s+")[0]);
				prRuta.println(ruta);

				boolean success = (new File(ruta)).mkdirs();
				if(!success) System.out.println("\t\t"+procesada+" ERROR");
				else
				{
					System.out.println("\t\t"+procesada);
					File folder = new File("./esqueleto");
					File[] listOfFiles = folder.listFiles();

					for(int i=0; i<listOfFiles.length; i++)
					{
						Path src = new File("./esqueleto/"+listOfFiles[i].getName()).toPath();
						Path dest=new File(ruta+"/"+listOfFiles[i].getName()).toPath();
						Files.copy(src, dest);
					}
				}
			}
			else System.out.println("XXXXXXXXXXXXXXXXXXXX ERROR XXXXXXXXXXXXXXXXXXXX");
		}
		br.close(); prNums.close(); prRuta.close();
	}
}
