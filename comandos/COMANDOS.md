clase 2.-

un sistema operativo es el administrador del hardware y el respondable de hacer que los programadas funcionen entre si sin chocar 
la terminal es un canal de texto directo con el sistema operativo 
los ingenieron pasan mucho tiempo en la terminal por la velocidad , la automatizacion,el control total ,a dministracion de servidores y herramientas de desarrollo 


COMANDOS: 

1 pwd.- (print working directory) me muestra el directorio donde estoy exactamente en ese momento - cuando me pierdo y nose en donde estoy uso este comando 

2 ls.-(list) sirve para ver todo lo que hay guardado dentro de una carpeta, donde estoy parado ahora mismo (para verificar si cree bien mis carpetas)

3 cd.- (change directory) sirve para cambiar de directorio-entrar o salir de de las carpetas (para entrar a una carpeta a guardar algo y luego salir)

4 mkdir.-(make directory) sirve para crear carpetas nuevas. 

5 touch.- sirve para crear archivos totalmente en blanco 

6 cat.- sirve para leer lo que dice un archivo de texto e imprimirlo directamente en terminal 

7 tree.- sirve para ver un mapa visual de tus archivos y carpetas en forma de ramificaciones 

8 man.- (manual) es la enciclopedia que se pone antes de otros comandos , te abre el manual oficial explicando para que sirve 

9 history.- es la memoria, muestra una lista numera de absolutamente todos los comandos que hice 

10 cp.-(copy) es para copiar archivos -cp resumen.txt copia_resumen.txt

11 mv.-(MOVE)para mover archivos de carpeta pero tambien usado para renombrar los archivos
mv archivo_viejo.txt nombre_nuevo.txt

12 rm.- (remove) eliminar archivos sueltos -rm basura.txt

13 rm -rf.-(recursive,force) borra todo sin preguntar , sin importar que la carpeta este llena. 

14 ls -la.- sirve para ver los permisos del sistema, dividido en 3 rwx (read,write,eXecute)

15 chmod.- (change mode) sirve para cambiar esos permiso y se hacen de forma numerica o textual - chmod 700 texto.txt -el primer numero es mio el segundo es para el grupo y el ultimo para otros 4=leer 2=escribir 1=ejecutar asi que 4+2+1= 7 entonces todos los permisos consedidos 

---la redireccion---
16 > .- atrapa lo que iba salir en pantalla y lo mete en un archivo (si existia algo lo sobreescribe) >> eso hace lo mismo pero lo pone abajo, no sobre escribe  


---tuverias y filtros---
|.- toma el resultado comando de la izquierda y lo inserta al comando de la derecha 
grep.- sirve para buscar palabras 

(Esto leerá el archivo de texto entero, pero el filtro grep solo dejará pasar y pintará de color la línea que tenga la palabra "comandos").

--contar palabras y lineas-- wc
wc.-(word count) si le agregas -l cuenta lineas 

head.- muestra solo las primeras 10 lineas - cat texto.txt | head 

tail.- muestra solo las ultimas 10 lineas (util para ver lo reciente)
