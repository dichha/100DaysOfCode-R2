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
public class NumberOfHoles {
    public static int getHoles(int[] nums){
        if(nums == null || nums.length == 0)
            return 0;
        int numOfHoles = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 8)
                numOfHoles += 2; 
            else if (nums[i] == 4 || nums[i] == 6 || nums[i] == 9 || 
                    nums[i] == 0)
                numOfHoles += 1; 
            else
                continue; 
            
        }
        return numOfHoles; 
    }
    /*
    public static void main(String[] args){
        int[] nums = {9, 8, 9, 9}; 
        int count = getHoles(nums); 
        System.out.println(count); 
    }
    */
    
}
