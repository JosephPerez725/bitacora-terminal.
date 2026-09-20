1. ¿Qué guardan los directorios `/home`, `/etc`, `/var` y `/tmp` en Linux? (pueden explorarlos con `ls` y `cat` en la VM)

/home es como el lugar donde los usuarios puenden crear sus carpetas en linux , es el area personal.

/etc es basicamente las configuraciones en formato texto de linux , es la sala de control

/var esta reservado para que el sistema operativo y los programas hagan cambiosa por detras de forma automatica  

/tmp (temporal) los programas usan esta especie de bloc de notas donde hacen calculos rapidos o guardar cosas por un instante , la regla es que no se debe guardar nada importante ahi, ya que cada vez que la computadora se reincia o apaga el sistema borra todo lo que hay dentro 


en si son las 4 carpetas maestras del sistema operativo de linux , cada una con una especialidad muy definida 


2. ¿Cuál es la diferencia entre una **ruta absoluta** y una **ruta relativa**? Dar 3 ejemplos de cada una desde su propia estructura de `bitacora-terminal`

ruta absoluta.- (el gps exacto)es el punto o el origen de todo , el origen de todo se llama la raiz y se representa con una barra diagonal / . es la direccion completa y exacta de un archivo. siempre empieza desde la raiz no importa donde este parado, xq esta ruta es inamovible 

/home/josex/Desktop/bitacora_terminal/comandos/COMANDOS.md 

/home/josex/Desktop/bitacora_terminal/investigacion/rutas-y-directorios.md 

/home/josex/Desktop/bitacora_terminal/evidencias/sesion-casa.txt 


ruta relativa.- (dar instrucciones desde donde estoy parado) 

comandos/COMANDOS.md (Para llegar a mi archivo de comandos desde aquí).

evidencias/sesion-casa.txt (Para entrar a mi carpeta de evidencias y ver mi historial).

investigacion/rutas-y-directorios.md (Para abrir mi tarea de investigación).


diferencia: NUNCA empieza con la barra de raiz (/) . empieza a navegar directamente a partir de la carpeta que tengas abierta en terminal. 




3. ¿Qué significan `.` y `..` en una ruta? Probarlo con `cd` y anotar qué pasó

"." significa "aqui mismo" o "el directorio actual" , es una forma de indicarle a linux que apunte al directorio donde estoy parado ahora mismo 

".." es decirle a linux que apunte a la carpeta que contiene la carpeta en la que estoy ahora , es como ir al directorio padre, un paso atras 


