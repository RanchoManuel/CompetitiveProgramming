#!/bin/bash

echo "Borrando Ejecucion previa"
rm -r resultado
mkdir resultado

rm -r paso_3/carpetas/
mkdir paso_3/carpetas/

for i in $(seq 0 3);
do
	cd "paso_$i/" && sh "paso_$i.sh"
	cd ..
done
