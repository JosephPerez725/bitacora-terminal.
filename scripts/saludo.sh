#!/bin/bash
# Adaptado de la referencia del profesor; ver ASISTENCIA.md.
if [ "$#" -ne 1 ] || [ -z "$1" ]; then
    echo "Uso: $0 <nombre>" >&2
    exit 1
fi
echo "Hola, $1"
