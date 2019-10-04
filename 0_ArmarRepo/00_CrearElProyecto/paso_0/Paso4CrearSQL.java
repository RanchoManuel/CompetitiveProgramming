import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.File;
import java.io.IOException;

public class Paso4CrearSQL {
	public static void main(String[] args) throws IOException {
		Map<String, Capitulo> capitulos = new LinkedHashMap<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String capitulo, subcapitulo, tema, ejercicio;
			for (String line, aux[]; (line = br.readLine()) != null;) {
				line = line.replaceAll("_", " ").replaceAll(":::", "");
				aux = line.split("/");
				capitulo = aux[0];
				subcapitulo = aux[1] = aux[1].substring(3);
				tema = aux[2] = aux[2].substring(3);
				ejercicio = aux[3];

				Capitulo esteCapitulo = capitulos.get(capitulo);
				if (esteCapitulo == null) {
					esteCapitulo = new Capitulo(capitulo);
				}

				Subcapitulo esteSubcapitulo = esteCapitulo.subcapitulos.get(subcapitulo);
				if (esteSubcapitulo == null) {
					esteSubcapitulo = new Subcapitulo(subcapitulo);
				}

				Tema esteTema = esteSubcapitulo.temas.get(tema);
				if (esteTema == null) {
					esteTema = new Tema(tema);
				}

				esteTema.ejercicios.add(ejercicio);
				esteSubcapitulo.temas.put(tema, esteTema);
				esteCapitulo.subcapitulos.put(subcapitulo, esteSubcapitulo);
				capitulos.put(capitulo, esteCapitulo);
			}
		}
		printSQL(capitulos);
	}

	private static void printSQL(Map<String, Capitulo> capitulos) {
		int indexCapitulo = 1, indexSubCapitulo = 1, indexTema = 1, indexEjercicio = 1;
		for (Capitulo capitulo : capitulos.values()) {
			System.out.printf("INSERT INTO chapter (id, text) VALUES (%d, '%s');\n", indexCapitulo, capitulo.text.replaceAll("'","''"));
			for (Subcapitulo subcapitulo : capitulo.subcapitulos.values()) {
				System.out.printf("INSERT INTO subchapter (id, chapter, text) VALUES (%d, %d, '%s');\n",
						indexSubCapitulo, indexCapitulo, subcapitulo.text.replaceAll("'","''"));
				for (Tema tema : subcapitulo.temas.values()) {
					System.out.printf("INSERT INTO topic (id, subchapter, text) VALUES (%d, %d, '%s');\n", indexTema,
							indexSubCapitulo, tema.text.replaceAll("'","''"));
					for (String ejercicio : tema.ejercicios) {
						System.out.printf(
								"INSERT INTO exercise (id, topic, text) VALUES (%d, %d, '%s');\n",
								indexEjercicio++, indexTema, ejercicio.replaceAll("'","''"));
					}
					indexTema++;
				}
				indexSubCapitulo++;
			}
			indexCapitulo++;
		}
	}

	private static class Capitulo implements Comparable<Capitulo> {
		private String text;
		Map<String, Subcapitulo> subcapitulos;

		public Capitulo(String text) {
			this.text = text;
			subcapitulos = new LinkedHashMap<>();
		}

		@Override
		public int compareTo(Capitulo other) {
			return text.compareTo(other.text);
		}

		@Override
		public String toString() {
			return text;
		}
	}

	private static class Subcapitulo implements Comparable<Subcapitulo> {
		private String text;
		Map<String, Tema> temas;

		public Subcapitulo(String text) {
			this.text = text;
			temas = new LinkedHashMap<>();
		}

		@Override
		public int compareTo(Subcapitulo other) {
			return text.compareTo(other.text);
		}

		@Override
		public String toString() {
			return text;
		}
	}

	private static class Tema implements Comparable<Tema> {
		String text;
		Set<String> ejercicios;

		public Tema(String text) {
			this.text = text;
			ejercicios = new LinkedHashSet<>();
		}

		@Override
		public int compareTo(Tema other) {
			return text.compareTo(other.text);
		}

		@Override
		public String toString() {
			return text;
		}
	}
}
