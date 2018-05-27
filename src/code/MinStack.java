/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author dichha
 */
public class MinStack {
    class Node{
        int val; 
        int min; 
        Node next; 
        public Node(int val, int min){
            this(val, min, null); 
        }
        
        public Node(int val, int min, Node next){
            this.val = val; 
            this.min = min; 
            this.next = next; 
        }
    }
    private Node head; 
    
    public void push(int x){
        if(head == null)
            head = new Node(x, x); 
        else
            head = new Node(x, Math.min(x,head.min), head);
           
    }
    public void pop(){
        head = head.next; 
    }
    public int top(){
        return head.val; 
    }
    public int getMin(){
        return head.min; 
    }
    /*
    public static void main(String[] args){
        MinStack ms = new MinStack(); 
        ms.push(-2); 
        ms.push(0); 
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop(); 
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }
    */
   
}
