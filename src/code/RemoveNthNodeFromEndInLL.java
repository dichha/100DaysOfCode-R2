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
public class RemoveNthNodeFromEndInLL {
    static class NodeList{
        int val; 
        NodeList next; 
        public NodeList(int val){
            this.val = val; 
            next = null; 
        }
    }
    public static NodeList remove(NodeList head, int n){
        NodeList start = new NodeList(Integer.MIN_VALUE); 
        start.next = head; 
        NodeList slow = head; 
        NodeList fast = head;
        
        while(fast.next != null){
            if(n <= 0){
                slow = slow.next; 
            }else{
                n--; 
            }
            fast = fast.next; 
            
        }
        if(slow.next != null){
            slow.next = slow.next.next; 
        }
        return start.next; 
        
    }
    /*
    public static void main(String[] args){
        NodeList n1 = new NodeList(1); 
        NodeList n2 = new NodeList(2); 
        NodeList n3 = new NodeList(3); 
        NodeList n4 = new NodeList(4);
        NodeList n5 = new NodeList(5);
        
        n1.next = n2; 
        n2.next = n3; 
        n3.next = n4; 
        n4.next = n5; 
        
        NodeList res = remove(n1, 2); 
        while(res != null){
            System.out.print(res.val + ", "); 
            res = res.next; 
        }
        
    }
    */
    
}
