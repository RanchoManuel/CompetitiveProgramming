#!bin/bash
echo "---- Paso 1 ----"

echo "Compilando"
javac XMLDomParser.java

echo "Ejecutando"
for i in $(seq 1 9);
do
	java XMLDomParser "cap_0$i.xml" > out1.txt
	echo "Capitulo_0$i" | cat - out1.txt > out2.txt
	mv out2.txt "../paso_2/capitulo_0$i.txt"
	echo "Archivo txt del capitulo $i creado"
done

rm *.class
rm out1.txt
