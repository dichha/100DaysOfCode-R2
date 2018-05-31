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
public class RomanToInteger {
    public static int romanToInteger(String roman){
        Map<String, Integer> map = new HashMap<String, Integer>(); 
        map.put("I", 1);
        map.put("V", 5); 
        map.put("X", 10); 
        map.put("L", 50); 
        map.put("C", 100); 
        map.put("D", 500); 
        map.put("M", 1000); 
        
        int res = 0; 
        
        for(int i=0; i<roman.length(); i++){
            if(i != (roman.length()-1)){
                int cur = map.get((Character.toString(roman.charAt(i)))); 
                //System.out.println(cur); 
                int next = map.get(Character.toString(roman.charAt(i+1)));
                if(cur < next){
                    res -= cur; 
                }else{
                    res += cur; 
                }
            }
        }
        res += map.get(Character.toString(roman.charAt(roman.length()-1)));
        return res;
    }
    /*
    public static void main(String[] args){
        String s = "MCDIX"; 
        System.out.println(s.charAt(0)); 
        int ans = romanToInteger(s);
        System.out.println(ans); 
    }
*/
    
}
