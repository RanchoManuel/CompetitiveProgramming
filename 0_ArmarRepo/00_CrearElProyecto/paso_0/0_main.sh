#!/bin/bash

echo "Borrando Ejecucion previa"

DATA_ORIGINAL="./dataOriginal/"

PASO1="../paso_1"
PASO2="../paso_2"
PASO3="../paso_3"
PASO4="../paso_4"
CARPETAS="$PASO3/carpetas"

RESULTADO="../resultado"

TEMP="temp"

rm -rf $PASO1 $PASO2 $PASO3 $PASO4 $RESULTADO $TEMP > /dev/null
mkdir $PASO1 $PASO2 $PASO3 $PASO4 $RESULTADO $CARPETAS $TEMP

function fn_paso_0 ()
{
	echo "---- Paso 0 ----"

	local old_txt1=".png\">"
	local new_txt1=".png\"\/>"

	local old_txt2="&nbsp;"
	local new_txt2=""

	for i in $(seq 1 9); do
		cat < "$DATA_ORIGINAL/data_0$i.xml" | sed "s/$old_txt1/$new_txt1/g" | sed "s/$old_txt2/$new_txt2/g" > "$PASO1/cap_0$i.xml"
		echo "Archivo xml del capitulo $i creado"
	done
}

function fn_paso_1 ()
{
	echo "---- Paso 1 ----"

	echo "Compilando"
	javac Paso1XMLDomParser.java

	echo "Ejecutando"
	for i in $(seq 1 9); do
		java Paso1XMLDomParser "$PASO1/cap_0$i.xml" > $TEMP/out1.txt
		echo "Capitulo_0$i" | cat - $TEMP/out1.txt > "$PASO2/capitulo_0$i.txt"
		echo "Archivo txt del capitulo $i creado"
	done

	rm *.class $TEMP/out1.txt
}

function fn_paso_2 ()
{
	echo "---- Paso 2 ----"

	echo "Compilando"
	javac Paso2CrearCarpetas.java

	echo "Ejecutando"
	for i in $(seq 1 9); do
		java Paso2CrearCarpetas < "$PASO2/capitulo_0$i.txt" > "$PASO4/resultadoCap_0$i.txt"
		cat rutas.txt >> $TEMP/allRutas.txt
		cat numeros.txt >> $TEMP/allNumeros.txt
		mv "Capitulo_0$i" $CARPETAS
		echo "Capitulo $i creado"
	done

	rm *.class
	rm rutas.txt && rm numeros.txt
}

function fn_paso_3 ()
{
	echo "---- Paso 3 ----"

	echo "Compilando"
	javac Paso3Url.java

	echo "Ejecutando"
	java Paso3Url < $TEMP/allNumeros.txt > $TEMP/allUrls.txt
	rm *.class

	echo "Juntando archivos"
	while read -r carpeta_destino && read -r url_pdf <&3; do
		wget $url_pdf -O "$CARPETAS/$carpeta_destino/Text.pdf" -nv
	done < $TEMP/allRutas.txt 3<$TEMP/allUrls.txt
	mv $CARPETAS* $RESULTADO
}

function fn_paso_4 ()
{
	echo "---- Paso 4 ----"

	echo "Compilando"
	javac Paso4CrearSQL.java

	for i in $(seq 1 9); do
		java Paso4CrearSQL "$i" < "$PASO4/resultadoCap_0$i.txt"
	done
}

fn_paso_0
fn_paso_1
fn_paso_2
fn_paso_3
fn_paso_4