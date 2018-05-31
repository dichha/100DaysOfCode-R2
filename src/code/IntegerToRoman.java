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
public class IntegerToRoman {
    public static String intToRoman(int num){
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; 
        String[] huns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
        String[] thous = {"", "M", "MM", "MMM"};
        
        return thous[num/1000] + huns[(num%1000)/100] + tens[(num %100)/10] + ones[num%10]; 
    } 
   /*
    public static void main(String[] args){
        int n = 199; 
        String ans = intToRoman(n); 
        System.out.println(ans); 
    }
    */
    
    
}
