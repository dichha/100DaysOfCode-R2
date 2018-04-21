
package code;


import java.util.LinkedList;
import java.util.Queue; 




public class SnakeAndLadder{
    static class Vertex{
        int cell; 
        int moves; 
    }
    public int findMoves(int[] board){
        int size = board.length; 
        
        // create visited array for each cell
        boolean[] visited = new boolean[size]; 
        
        Queue<Vertex> queue = new LinkedList();
        
        // start from position 1 (index 0) and it is already visited
        Vertex vertex = new Vertex(); 
        vertex.cell = 0; 
        visited[0] = true; 
        
        queue.add(vertex); 
        
        while(!queue.isEmpty()){
            vertex = queue.remove(); 
            int cellNum = vertex.cell; 
            if(cellNum == size-1)
                break; 
            for(int i=cellNum+1; i <= cellNum+6 && i < size; i++){
                if(!visited[i]){
                    // add it to the queue, update moves and make vsited; 
                    Vertex currentVertex = new Vertex(); 
                    currentVertex.moves = vertex.moves + 1; 
                    visited[i] = true; 
                   
                    // now fill the cell that can be reached by throwing dice at that cell
                    if(board[i] == -1){
                        currentVertex.cell = i; 
                    }else{
                        currentVertex.cell = board[i]; 
                    }
                    // add to queue
                    queue.add(currentVertex); 
                }
            }
            
            
        }
         return vertex.moves;
    }
    /*
    public static void main(String[] args){
        int size = 36; 
        int[] board = new int[size]; 
        
        for(int i=0; i< size; i++){
            board[i] = -1; 
        }
        // ladders
        board[2] = 15;
        board[14] = 14; 
        board[20] = 31; 
        
        
        // Snakes
        board[11] = 1; 
        board[29] = 3; 
        board[34] = 21; 
        
        SnakeAndLadder s = new SnakeAndLadder(); 
        
        System.out.println("Minimum Dice throw needed to reac to end: " + s.findMoves(board));
    }
*/
    
}