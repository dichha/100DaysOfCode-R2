/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator; 

/**
 *
 * @author dichha
 */
class HuffmanNode{
    int data; 
    char c; 
    
    HuffmanNode left; 
    HuffmanNode right; 
    
}

class MyComparator implements Comparator<HuffmanNode>{
    public int compare(HuffmanNode x, HuffmanNode y){
        return x.data - y.data; 
    }
}
public class HuffmanEncoding {
    // recursive function to print the huffman-code through the tree traversal. 
    // Here's the huffman - code generator
    public static void printCode(HuffmanNode root, String s){
        // base case: if the left and right are null
        // then it's a leaf node and we print the code s generated by 
        // traversing the tree. 
        
        
        if(root.left == null && root.right == null && Character.isLetter(root.c)){
            System.out.println(root.c + ": " + s);
            return; 
        }
        
        // if we go left then add '0' to the code.
        // if we go right then we add '1' to the code. 
        
        // recursive calls for left and right sub-tree of the generated tree. 
        
        printCode(root.left, s + "0"); 
        printCode(root.right, s + "1"); 
            
    }
    /*
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); 
        
        // number of characters
        int n = 6; 
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charFreq = {5, 9, 12, 13, 16, 45}; 
        
        // creating a priority queue q. 
        // makes a min priority queue(min-heap)
        
        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator()); 
        
        for(int i=0; i<n; i++){
            //creating a huffman code obj and adding it  to the priority-queue.
            HuffmanNode hn = new HuffmanNode(); 
            hn.c = charArray[i]; 
            hn.data = charFreq[i]; 
            
            hn.left = null; 
            hn.right = null; 
            
            // add functions adds the huffman node to the queue
            
            q.add(hn); 
            
        }
        // create a root node
        
        HuffmanNode root = null; 
        
        // Here we will extrack the two minimum valu from the heap each time until its size reduces to 1, 
        // extract until all the nodes are extracted
        
        while(q.size() > 1){
            // first min extract
            HuffmanNode x = q.peek(); 
            q.poll(); 
            
            // second min = q.peek(); 
            HuffmanNode y = q.peek(); 
            q.poll(); 
            
            // new node f which is equal
            HuffmanNode f = new HuffmanNode(); 
            
            // to the sum of the frequency of the two nodes
            // assigning values to the f node. 
            
            f.data = x.data + y.data; 
            f.c = '-'; 
            
            // first extracted node as left child. 
            f.left = x; 
            
            // second extracted node as the right child
            f.right = y; 
            
            // marking the f node as the root node
            root = f; 
            
            // add this to the priority-queue
            q.add(f);     
            
        }
        // print the codes by traversing the tree
        printCode(root, ""); 
                
        
    }
    */
    
}