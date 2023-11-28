# Páctica de búsqueda heurística sin adversarios

El propósito de esta práctica es que el alumno reutilice código que implementa el algoritmo A*. Se bajará código de Github, y lo utilizará para ejecutar
este algoritmo para un grafo concreto.

## Instrucciones de Uso

    -Instalación de ant en maquina virtual
    -sudo apt install ant
    -Modificaciones en build.xml
    -Cambio en el main 2 grafós uno dirigido y otro no
        Una vez ejecutado:

         UNDIRECTED GRAPH: Optimal path from vertex 1 to 8:
                    [ 1(0) ] -> [ 8(0) ] = 1

            DIRECTED GRAPH: Optimal path from vertex 1 to 8:
                    [ 1(0) ] -> [ 3(0) ] = 9

                    [ 3(0) ] -> [ 6(0) ] = 2

                    [ 6(0) ] -> [ 8(0) ] = 14
        

## Reglas del juego
1. ¿Qué variable representa la lista ABIERTA?

                La variable que representa la lista ABIERTA es openSet.

2. ¿Qué variable representa la función g?
3.              
                La variable que representa la función g es gScore.

3. ¿Qué variable representa la función f?
            
                La variable que representa la función f es fScore.


4. ¿Qué método habría que modificar para que la heurística representara
la distancia aérea entre vértices?

                
                El método que habría que modificar es heuristicCostEstimate().


5. ¿Realiza este método reevaluación de nudos cuando se encuentra una
nueva ruta a un determinado vértice? Justifique la respuesta.

        El método heuristicCostEstimate() realiza la reevaluación de            
        nudos cuando se encuentra una nueva ruta a un determinado               
        vértice. Este método calcula la heurística estimada desde el            
        nodo actual hasta el destino, y si se encuentra una nueva ruta          
        más corta, se actualiza la estimación. Esto contribuye a                
        encontrar el camino más corto en el grafo.