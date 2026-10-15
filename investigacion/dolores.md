# Mediciones de la recuperación: procedural y OOP

Documento asistido con mediciones reales. No representa trabajo manual anterior.
Referencia del profesor: commit 09ed0ef. Los números describen estos archivos,
no las modificaciones que hubiera hecho otro estudiante.

## Clase 5: alerta CPU
Comparación con git diff --no-index --numstat entre java/Sentinel.java y
java/SentinelCpu.java: 11 líneas agregadas y 1 eliminada, en un archivo de destino.
La sustitución del nombre de clase se incluye en ese conteo.
Dos variables de estado nuevas: cpuThreshold y cpuAlerts.
Se reutiliza cpuPct, ya presente. args[1] fija el segundo umbral; la condición
es mayor o igual. La alerta CPU se cuenta independientemente de la memoria.
Una tercera alerta requeriría otro umbral, contador, validación, condición y
salida en el mismo main: aumenta la lógica repetida y las variables sin dueño.

## Clase 5: validaciones
Frente al Sentinel.java original: 22 líneas agregadas y 2 eliminadas.
Hay dos guardias nuevas de memoria, después del parseo y antes de la división:
memTotalKb <= 0 y memUsedKb < 0 || memUsedKb > memTotalKb.
Cada rechazo incrementa invalid y continúa, sin contaminar el resumen.
También hay una comprobación de presencia de cada campo dentro del try y
una validación del umbral al inicio: cuatro if nuevos en total.
La ausencia de mem_total_kb se detecta antes de substring.
El parseo sigue siendo el parser didáctico por indexOf del curso, no un parser
JSON general. No se declara compatible con cualquier documento JSON.

## Clase 6: misión A aislada — alerta CPU
Medición real con git diff --no-index --numstat. Para separar A de B se
construyó una copia local de análisis del Main original del profesor que
contiene únicamente la conexión de CpuRule, sin cambiar read ni invalid.
Esta copia es una herramienta de medición actual: no representa una versión
histórica ni un commit anterior y no se incluye en la entrega.

Comparación con oop/ del profesor:
- Main.java: 7 líneas agregadas y 0 eliminadas.
- Console.java: 8 agregadas y 0 eliminadas.
- CpuRule.java: archivo nuevo de 45 líneas, adaptado de MemoryRule.
Misión A: 3 archivos, 60 líneas agregadas y 0 eliminadas.
Se incluyen comentarios y líneas en blanco del nuevo archivo.
Main sí cambió: crea la regla, evalúa CPU y solicita las salidas a Console.
CpuRule es dueña del umbral y los aciertos. La duplicación con MemoryRule
queda visible; no se agregó herencia aún.

## Clase 6: misión B y total combinado
Comparando la copia de análisis con A contra el Main final A+B:
- Main.java: 6 líneas agregadas y 8 eliminadas.
- Counter.java: archivo nuevo de 26 líneas.
Misión B sobre A: 2 archivos, 32 líneas agregadas y 8 eliminadas.
Counter es dueño de read e invalid. Se eligió un objeto separado porque
cuenta todo el flujo, mientras History almacena solo lecturas válidas.
Su guardia impide registrar más inválidas que líneas leídas.

Comparación directa del resultado final A+B con oop/ del profesor:
- Main.java: 12 líneas agregadas y 7 eliminadas.
- Console.java: 8 agregadas y 0 eliminadas.
- CpuRule.java: 45 líneas nuevas.
- Counter.java: 26 líneas nuevas.
Total directo combinado: 4 archivos, 91 agregadas y 7 eliminadas.
Los totales de los diffs por etapas no se suman como si fueran el diff directo:
la misión B modifica la ubicación de líneas de integración añadidas por A.

## Pruebas observadas
- Muestra limpia: 20 válidas; 3 alertas de memoria con umbral 80.
- Muestra rota: 7 leídas, 3 válidas y 4 inválidas; las dos versiones terminan.
- CPU con muestra limpia y umbral 80: 1 alerta en ambas versiones.
- Fixture sintética CPU=80: alerta al ser exactamente igual al umbral.
- diff sin encabezados: idéntico para la muestra limpia, con y sin alerta CPU.
- Flujo real del colector: consumido por Echo y ambos dashboards.

Abstracción: Contract.parse oculta el detalle de extraer los campos y
Console oculta los formatos. Encapsulamiento: Snapshot protege lecturas,
las reglas validan umbrales y Counter protege su contabilidad.

Las pruebas reproducibles están en verificacion/ y sus salidas reales en evidencias/.
