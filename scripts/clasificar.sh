#!/bin/bash
# Adaptado de la referencia del profesor; ver ASISTENCIA.md.
if [ "$#" -ne 1 ]; then
    echo "Uso: $0 <ruta>" >&2
    exit 1
fi
if [ -f "$1" ]; then
    echo "$1 es un archivo"
elif [ -d "$1" ]; then
    echo "$1 es un directorio"
else
    echo "$1 no existe"
fi
