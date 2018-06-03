/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class ThreeSumClosest {
   public static int threeSumClosest(int[] nums, int target){
     if(nums == null || nums.length == 0)
            return 0; 
       if(nums.length == 3){
           return nums[0] + nums[1] + nums[2];
       }
       Arrays.sort(nums);
       int diff = Integer.MAX_VALUE/2; 
       for(int i=0; i<nums.length-2; i++){
           int p = i+1; 
           int p1 = nums.length -1; 
           int tmpSum = 0; 
           
           while(p < p1){
               tmpSum = nums[i] + nums[p] + nums[p1]; 
               if(tmpSum == target)
                   return tmpSum; 
               else if( tmpSum < target)
                   p++; 
               else 
                   p1--; 
               diff = Math.abs(tmpSum - target) < Math.abs(diff-target)? tmpSum : diff; 
           }
           
       }
       return diff;
   }
   /*
   public static void main(String[] args){
       int[] nums = {-3, -2, -5, 3, -4};
       //int[] nums = {1, 1, 1, 0}; 
       int ans = threeSumClosest(nums, -1);
       System.out.println(ans); 
   }
    */
    
}
