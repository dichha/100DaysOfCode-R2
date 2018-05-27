/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.util.Deque; 
import java.util.ArrayDeque; 
import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class SlidingWindowII {
    public static int[] slidingWindow(int[] nums, int k){
        int[] max = new int[nums.length - k + 1]; 
        int r = 0; 
        
        Deque<Integer> q = new ArrayDeque<Integer>(); 
        for(int i=0; i<nums.length; i++){
            // remove index out of sliding window range
            while(!q.isEmpty() && q.peek() < i-k+1) 
                q.poll(); 
            
            // remove elements that's smaller than the current one
            while(!q.isEmpty() && nums[i] > nums[q.peekLast()])
                q.pollLast(); 
            
            q.offer(i);
            if(i >= k-1)
                max[r++] = nums[q.peek()]; 
            
            
        }
        return max; 
    }
    /*
    public static void main(String[] args){
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7}; 
        int[] ans = slidingWindow(nums, 3); 
        System.out.println(Arrays.toString(ans)); 
    }
    */
}
