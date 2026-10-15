# JVM, JRE, JDK y el contrato de Sentinel

Nota de estudio preparada con asistencia durante la recuperación. Revisar y
redactar personalmente antes de presentarla como respuesta propia; ver ASISTENCIA.md.

## 1. Herramientas Java
La JVM ejecuta bytecode. El JRE reúne la JVM y las bibliotecas necesarias para
ejecutar aplicaciones. El JDK agrega herramientas de desarrollo, como javac
y jshell; por eso un programador necesita el JDK. En este entorno se usa OpenJDK 21.

## 2. Interpretación y compilación
Bash interpreta instrucciones y coordina programas. javac comprueba el código
Java y lo compila a bytecode en archivos .class; java inicia la JVM y ejecuta
la aplicación. La JVM puede interpretar bytecode y compilar partes a código
nativo durante la ejecución. java Archivo.java también permite ejecutar un
archivo fuente mediante compilación implícita; no elimina la compilación.

## 3. Independencia de las capas
El dashboard consume un objeto JSON por línea con los campos pactados.
No necesita conocer /proc ni el lenguaje del productor. Un colector Bash
puede reemplazarse por uno C si ambos respetan el formato y la frecuencia.
La conexión es stdin/stdout mediante una tubería.

Referencia consultada: SIS-113/sentinel-readme.md, secciones 1 y 2.
