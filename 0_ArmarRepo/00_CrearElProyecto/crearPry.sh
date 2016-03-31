#!bin/bash

echo "Borrando Ejecucion previa"
rm -r resultado
mkdir resultado

for i in $(seq 0 2);
do
	cd "paso_$i/" && sh "paso_$i.sh"
	cd ..
done
