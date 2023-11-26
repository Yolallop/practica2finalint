package aplicacion;
import com.jwetherell.algorithms.graph.*;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;


public class Main

{



public static void main(String[] args) {
    // TODO code application logic here
    UndirectedGraph g = new UndirectedGraph();
    System.out.println(g.graph);
    AStar<Integer> aStar = new AStar<Integer>();
    List<Graph.Edge<Integer>> path = aStar.aStar(g.graph, g.v1, g.v5);
    System.out.println(path);


}

}