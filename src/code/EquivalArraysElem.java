/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dichha
 */
public class EquivalArraysElem {
    public static boolean allStringSetsIdentical(String[][] sets){
        if(sets == null || sets.length == 1 || sets.length == 0)
            return true; 
        String[] goldStd = sets[0]; 
        Set<String> std = new HashSet<String>(); 
        
        for(int i=0; i<goldStd.length; i++){
            std.add(goldStd[i]); 
        }
        
        for(int i=1; i<sets.length; i++){
            String[] check = sets[i];
            Set<String> compare = new HashSet<String>(); 
            for(int j=0; j<check.length; j++){
               compare.add(check[j]); 
            }
            
            if(!std.equals(compare)){
                return false; 
            }
            
        }
        return true; 
    }
    /*
    public static void main(String[] args){
        String[][] set1 = new String[][]{{"a", "b"}, {"b", "b", "a"}, {"b", "a"}}; 
        String[][] set2 = new String[][]{{"a", "b"}, {"a"}, {"b"}}; 
        
        boolean ans = allStringSetsIdentical(set1); 
        System.out.println(ans); 
        
    }
    */
}
