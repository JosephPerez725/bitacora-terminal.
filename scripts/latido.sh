#!/bin/bash
# Adaptado de la referencia del profesor; ver ASISTENCIA.md.
if [ "$#" -ne 1 ] || ! [[ "$1" =~ ^[0-9]{1,9}$ ]]; then
    echo "Uso: $0 <numero de latidos no negativo, hasta 9 digitos>" >&2
    exit 1
fi
n=$((10#$1))
i=1
while [ "$i" -le "$n" ]; do
    echo "latido $i — $(date +%T)"
    sleep 1
    i=$((i + 1))
done
echo "fin"
