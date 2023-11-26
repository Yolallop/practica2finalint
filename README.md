README - Algoritmo A* en Java
Descripción del Proyecto
El propósito de esta práctica es que el alumno reutilice código que implementa el algoritmo A*. Se bajará código de Github, y lo utilizará para ejecutareste algoritmo para un grafo concreto.

Estructura del Proyecto
El proyecto consiste en un programa Java con las siguientes partes:


Preguntas 
¿Qué variable representa la lista ABIERTA?
La variable que representa la lista ABIERTA es openSet.

¿Qué variable representa la función g?
La variable que representa la función g es gScore.

¿Qué variable representa la función f?
La variable que representa la función f es fScore.

¿Qué método habría que modificar para que la heurística representara la distancia aérea entre vértices?
El método que habría que modificar es heuristicCostEstimate().

¿Realiza este método reevaluación de nudos cuando se encuentra una nueva ruta a un determinado vértice? Justifique la respuesta.
El método heuristicCostEstimate() realiza la reevaluación de nudos cuando se encuentra una nueva ruta a un determinado vértice. Este método calcula la heurística estimada desde el nodo actual hasta el destino, y si se encuentra una nueva ruta más corta, se actualiza la estimación. Esto contribuye a encontrar el camino más corto en el grafo.