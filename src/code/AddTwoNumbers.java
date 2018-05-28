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
public class AddTwoNumbers {
    static class ListNode{
        int val;
        ListNode next; 
        public ListNode(int val){
            this.val = val; 
            next = null; 
        }
    }
    public static ListNode sumOfTwoNodes(ListNode l1, ListNode l2){
        int c = 0;
        ListNode head = null; 
        ListNode ptr = null; 
        while( l1 != null || l2 != null || c != 0){
            if(l1 != null){
                c += l1.val; 
                l1 = l1.next; 
            }
            if (l2 != null){
                c += l2.val; 
                l2 = l2.next; 
            }
            if(head == null ){
                head = new ListNode(c%10);
                ptr = head; 
            }else{
                head.next = new ListNode(c%10);
                head = head.next; 
            }
            c = c/10; 
        }
        return ptr; 

    }
    /*
    public static void main(String[] args){
    
         ListNode n1 = new ListNode(2); 
         ListNode n2 = new ListNode(4); 
         ListNode n3 = new ListNode(3); 
         n1.next = n2;
         n2.next = n3;
         
         ListNode m1 = new ListNode(5); 
         ListNode m2 = new ListNode(6); 
         ListNode m3 = new ListNode(4); 
         
         m1.next = m2; 
         m2.next = m3; 
         
         ListNode ans = sumOfTwoNodes(n1, m1); 
         while(ans != null){
             System.out.print(ans.val);
             ans = ans.next; 
         }
         System.out.println(); 
    }
    */
    
}
