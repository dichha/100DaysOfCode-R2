/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.util.LinkedList; 
/**
 *
 * @author dichha
 */
public class WeightedGraph {
    static class Edge{
        int src; 
        int dst;
        int weight; 
        
        public Edge(int src, int dst, int weight){
            this.src = src; 
            this.dst = dst; 
            this.weight = weight; 
        }
    }
    static class Graph{
        int vertices; 
        LinkedList<Edge> [] adjacencyList; 
        
        Graph(int vertices){
            this.vertices = vertices; 
            adjacencyList = new LinkedList[vertices];
            
            // initialize adjcency lists for all the vertices
            
            for(int i=0; i<vertices; i++){
                adjacencyList[i] = new LinkedList<>();
            }    
        }
        public void addEdge(int src, int dst, int weight){
            Edge edge = new Edge(src, dst, weight); 
            adjacencyList[src].addFirst(edge);
        }
        
        public void printGraph(){
            for(int i=0; i < vertices; i++){
                LinkedList<Edge> list = adjacencyList[i];
                for(int j=0; j<list.size(); j++){
                    System.out.println("vertex-" + i + " is connected to " + 
                            list.get(j).dst + " with weight " + list.get(j).weight
                    );
                }
            }
        }
        /*
        public static void main(String[] args){
            int  vertices = 6; 
            Graph graph = new Graph(vertices); 
            
            graph.addEdge(0, 1, 4);
            
            graph.addEdge(0, 2, 3);
            
            graph.addEdge(1, 3, 2);
            
            graph.addEdge(1, 2, 5);
            
            graph.addEdge(2, 3, 7);
            
            graph.addEdge(3, 4, 2);
            
            graph.addEdge(4, 0, 4);
            
            graph.addEdge(4, 1, 4);
            
            graph.addEdge(4, 5, 6);
            
            graph.printGraph();
        }
        */
    }
    
}
