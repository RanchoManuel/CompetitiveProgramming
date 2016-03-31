#!bin/bash
echo "---- Paso 0 ----"

OLD1=".png\">"
NEW1=".png\"\/>"

OLD2="&nbsp;"
NEW2=""

for i in $(seq 1 9);
do
	cat < "data_0$i.xml" | sed "s/$OLD1/$NEW1/g" | sed "s/$OLD2/$NEW2/g" > "cap_0$i.xml"
	mv "cap_0$i.xml" "../paso_1/cap_0$i.xml"
	echo "Archivo xml del capitulo $i creado"
done
