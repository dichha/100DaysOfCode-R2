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
public class AtoI {
    public static int atoi(String s){
        String cleanS = s.trim(); 
        char[] arr = cleanS.toCharArray(); 
        String res = ""; 
        double ans;  
        for(char c: arr){
            if(!res.isEmpty() && (c < 48 || c > 57)){
                break;
            }
            if(c != 43 && c != 45 && (c < 48 || c > 57))
                break; 
            
            if(c == 43 || c == 45 || (c > 48 && c <57)){
                res += c; 
            }        
        }
        try{
            ans = Double.valueOf(res);
        }catch(NumberFormatException e){
            return 0; 
        }
        
        if(ans - Integer.MAX_VALUE > 0) return Integer.MAX_VALUE; 
        if(ans - Integer.MIN_VALUE < 0) return Integer.MIN_VALUE; 
        
        return (int) ans; 
    }
    public static void main(String[] args){
        String s = "  -231"; 
        int ans = atoi(s);
        System.out.println(ans); 
    }
    
}
