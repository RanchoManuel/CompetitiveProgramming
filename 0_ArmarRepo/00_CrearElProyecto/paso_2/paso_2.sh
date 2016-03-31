#!bin/bash
echo "---- Paso 2 ----"

echo "Compilando"
javac CrearCarpetas.java

echo "Ejecutando"
for i in $(seq 1 9);
do
	java CrearCarpetas < "capitulo_0$i.txt" > "../reporte/resultadoCap_0$i.txt"
	mv "Capitulo_0$i" "../resultado/"
	echo "Capitulo $i creado"
done
