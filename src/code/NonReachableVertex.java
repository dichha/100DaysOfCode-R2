/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author dichha
 */
public class NonReachableVertex {
    static class Graph{
        int vertices; 
        LinkedList<Integer>[] adjList; 
        Graph(int vertices){
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for(int i=0; i< vertices; i++){
                adjList[i] = new LinkedList<>(); 
            }
        }
        /*
        public void addEdge(int src, int dst){
            adjList[src].addFirst(dst); 
            adjList[dst].addFirst(src);
        }
        */
        public int calculateVertices(int vertex){
            boolean[] visited = new boolean[vertices]; 
            //System.out.println(Arrays.toString(visited));
            // Do the DFS from the given vertex
            dfs(vertex, visited);
            int count=0; 
            for(int i=0; i<visited.length; i++){
                if(!visited[i])
                    count++;
            }
            return count; 
        }
        
        public void dfs(int vertex, boolean[] visited){
            visited[vertex] = true; 
            for(int i=0; i<adjList[vertex].size(); i++){
                if(!visited[adjList[vertex].get(i)])
                    dfs(adjList[vertex].get(i), visited);
                
                else
                    visited[adjList[vertex].get(i)]= true; 
                
            }
        }
        
        public void addEgde(int src, int dst) {
            adjList[src].addFirst(dst); 
            adjList[dst].addFirst(src);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        
        
    }
    /*
    public static void main(String[] args){
        int vertices = 8; 
        Graph graph = new Graph(vertices);
        
        graph.addEgde(0, 1);
        graph.addEgde(1, 2);
        graph.addEgde(2, 3);
        graph.addEgde(3, 1);
        graph.addEgde(4, 5);
        graph.addEgde(5, 6);
        int nonReachableVertex = graph.calculateVertices(0);
        System.out.println(nonReachableVertex);
        int nonReachableVertex2 = graph.calculateVertices(5);
        System.out.println(nonReachableVertex2);
    }
    */
    
}
