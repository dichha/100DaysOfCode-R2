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
public class FindDuplicate {
    public static int findDuplicate(int[] nums){
        int low = 1; // [low, high)
        int high  = nums.length; 
        
        while(low < high){
            int mid = low + (high - low)/2;
            int leftCount = 0;
            int midCount = 0; 
            int rightCount = 0; 

            for(int i: nums){
                if(i == mid){
                    midCount++; 
                }else if(i >= low && i < mid){
                    leftCount++; 
                }else{
                    rightCount++; 
                }
            }
            if(midCount > 1){
                return mid; 
            }
            if(leftCount > (mid-low)){ //[low, mid)
                high = mid;
            }else{ //[mid+1, high)
                low = mid+1; 
            }
        }
        
        return low; 
    }
    /*
    public static void main(String[] args){
        //int[] arr = {1, 3, 4, 2, 2};
        int[] arr = {3, 1, 3, 4, 2,2,2};
        int ans = findDuplicate(arr); 
        System.out.println(ans);
    }
    */
}
