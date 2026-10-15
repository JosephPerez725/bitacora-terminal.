# Responsabilidades de Sentinel OOP

Nota asistida; requiere revisión y redacción personal para entrega académica.
La tabla cubre las seis clases de referencia y las dos añadidas.

| Clase | Qué sabe | Qué esconde | Qué estado inválido hace imposible |
|---|---|---|---|
| Snapshot | Una lectura, su porcentaje y hora | Sus siete atributos privados e inmutables y el cálculo | Total de memoria no positivo, usada fuera de rango, CPU fuera de 0–100, procesos negativos y nombre vacío, según las guardias del constructor |
| Contract | Convertir una línea del contrato a Snapshot | Búsqueda raw, conversiones y constructor privado | Campos requeridos ausentes o valores que no puede convertir; Snapshot completa la validación |
| MemoryRule | Cuándo la memoria cruza el umbral y cuántas veces | Umbral y contador privados | Regla con umbral fuera de 1–100 |
| History | Guardar lecturas válidas y obtener estadísticas | Arreglo, capacidad y contador | Inserción de null y modificación externa del arreglo |
| Console | Mostrar encabezado, lecturas, errores y resumen | Códigos ANSI y formatos | No valida datos del dominio: delega esa responsabilidad |
| Main | Conectar entrada, parser, reglas, historial y consola | La coordinación del flujo; no contiene atributos de dominio | No garantiza invariantes propias; delega y captura rechazos |
| CpuRule | Evaluar CPU y contar alertas | Umbral y aciertos privados | Regla con umbral fuera de 1–100 |
| Counter | Contar líneas leídas e inválidas | Dos contadores privados | Más inválidas que leídas |

Snapshot no tiene setters porque una lectura pasada no se debe editar.
private controla acceso; final impide reasignar atributos; el constructor valida.
Las funciones estáticas de Contract son herramientas; los métodos de Snapshot
consultan el estado de una instancia particular.
