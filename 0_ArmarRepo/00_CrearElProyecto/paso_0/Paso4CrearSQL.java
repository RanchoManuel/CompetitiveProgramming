import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;

public class Paso4CrearSQL
{
    public static void main(String[] args) throws IOException
    {
        String capitulo = "Capitulo " + Integer.parseInt(args[0].trim().replaceAll("[a-zA-Z\\.]", ""));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(String line; (line=br.readLine())!=null;){
            line=line.replaceAll("_", " ").replaceAll(":::","");
            if(line.startsWith("\t\t")) System.out.println("Ejercicio: " + line);
            else if(line.startsWith("\t")) System.out.println("Categoria: " + line);
            else System.out.println("Subcapitulo: " + line);
        }
        System.out.println("Capitulo: " + capitulo);
        br.close();
    }
}
