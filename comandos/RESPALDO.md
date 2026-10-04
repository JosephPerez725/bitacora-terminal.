# Mi Bitacora de respaldo
1. find proyecto-sensores -name '*.tmp' -o -name '*~' : Busque la basura
2. rm proyecto-sensores/datos/cache-viejo.tmp proyecto-sensores/src/prueba.tmp proyecto-sensores/docs/NOTAS.md~ : Elimine la basura
3. chmod u+x proyecto-sensores/src/analizar.sh : Permisos de ejecucion
4. cat proyecto-sensores/datos/*.log | grep 'ERROR' > proyecto-sensores/reporte-errores.txt : Filtrado de errores
5, mkdir respaldos: creacion de la carpeta 
6. tar -czf respaldos/proyecto-$(date +%F).tar.gz proyecto-sensores:Compresion final
