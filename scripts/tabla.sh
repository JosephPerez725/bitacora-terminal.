#!/bin/bash
# Adaptado de la referencia del profesor; ver ASISTENCIA.md.
if [ "$#" -ne 1 ] || ! [[ "$1" =~ ^-?[0-9]{1,9}$ ]]; then
    echo "Uso: $0 <entero de hasta 9 digitos>" >&2
    exit 1
fi
numero=$1
signo=1
if [[ "$numero" == -* ]]; then
    signo=-1
    numero=${numero#-}
fi
numero=$((signo * 10#$numero))
for i in $(seq 1 10); do
    echo "$1 x $i = $((numero * i))"
done
