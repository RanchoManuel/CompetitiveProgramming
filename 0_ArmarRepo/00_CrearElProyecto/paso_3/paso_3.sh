#!/bin/bash
echo "---- Paso 3 ----"

echo "Compilando"
javac Url.java

echo "Ejecutando"
java Url < allNumeros.txt > allUrls.txt
rm *.class

echo "Juntando archivos"
while read -r a && read -r b <&3; do
	printf "$a\n$b\n" >> paraUsar.txt;
done < allRutas.txt 3<allUrls.txt

mv paraUsar.txt carpetas/
cd carpetas
ORIGEN=$PWD

n=0
echo "Bajando pdfs"
for line in $(cat paraUsar.txt);
do
	out=$(( $n % 2 ))
	if [ $out -eq 0 ]; then
		cd $line
	else
		wget $line -O "$PWD/Text.pdf" -nv
		cd $ORIGEN
	fi
	
	n=$((n + 1))
done

rm paraUsar.txt
mv * ../../resultado
