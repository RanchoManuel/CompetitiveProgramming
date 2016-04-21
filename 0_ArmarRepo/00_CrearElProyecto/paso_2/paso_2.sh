#!bin/bash
echo "---- Paso 2 ----"

echo "Compilando"
javac CrearCarpetas.java

echo "Ejecutando"
for i in $(seq 1 9);
do
	java CrearCarpetas < "capitulo_0$i.txt" > "../reporte/resultadoCap_0$i.txt"
	cat rutas.txt >> allRutas.txt
	cat numeros.txt >> allNumeros.txt
	mv "Capitulo_0$i" "../paso_3/carpetas"
	echo "Capitulo $i creado"
done

rm *.class
rm rutas.txt && rm numeros.txt

mv allRutas.txt ../paso_3
mv allNumeros.txt ../paso_3
