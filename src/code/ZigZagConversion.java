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
public class ZigZagConversion {
    public static String convert(String str, int nRows){
        // edge case
        if(nRows == 1){
            return str; 
        }
       StringBuilder builder = new StringBuilder(); 
       int step = 2 * nRows - 2; 
       for(int i=0; i<nRows; i++){
           if(i==0 || i == nRows-1){
               for(int j=i; j<str.length(); j += step){
                   builder.append(str.charAt(j));
               }
           }else{
               // middle
               int j=i; 
               boolean flag = true; 
               int step1 = 2*(nRows - 1 - i); 
               int step2 = step - step1; 
               while(j < str.length()){
                   builder.append(str.charAt(j)); 
                   if(flag){
                       j = j + step1; 
                   }else{
                       j = j + step2;
                   }
                   flag =! flag; 
               }
           }
       }
        
        return builder.toString(); 
        
    }
    /*
    public static void main(String[] args){
        String s ="PAYPALISHIRING"; 
        String ans = convert(s, 3);
        System.out.println(ans);   
    }
    */
}
