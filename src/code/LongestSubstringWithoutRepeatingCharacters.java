/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dichha
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
        Map<Character, Integer> charMap = new HashMap();
        int maxSubLength = 1; 
        int tempMaxSubLength = 0;
        int strLength = s.length(); 
        int start = 0; 
        
        if((strLength == 0) || (strLength == 1))
            return strLength;
        
        for(int i=0; i<strLength; i++){
            if(charMap.containsKey(s.charAt(i))){
                start = Math.max(start, charMap.get(s.charAt(i))+1); 
                System.out.println("start: " + start); 
                tempMaxSubLength = i-start+1;
                System.out.println("tempMaxSubLength: " + tempMaxSubLength);
            }else{
                tempMaxSubLength++; 
            }
            charMap.put(s.charAt(i), i); // when there is duplication, update it
            if(tempMaxSubLength > maxSubLength)
                maxSubLength = tempMaxSubLength; 
        }
        return maxSubLength; 
    }
    /*
    public static void main(String[] args){
        String s = "pwwkew"; 
        int ans = lengthOfLongestSubstring(s); 
        System.out.println(ans);
    }
    */
}
