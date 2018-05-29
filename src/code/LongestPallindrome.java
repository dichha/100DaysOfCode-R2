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
public class LongestPallindrome {
    public static String getLongestPallindrome(String s){
        int n = s.length(); // get length of input string
        // table[i][j] will be false if substring[i..j] is not pallindrome else
        // table[i][j] = true
        boolean[][] table = new boolean[n][n]; 
        
        int maxLen = 1;
        int start = 0; 
       
        // each character is pallindrome in itself
        for(int i=0; i<n; i++){
            table[i][i] = true; 
        }
        // checking for substring of length 2
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                table[i][i+1] = true;
                maxLen = 2;
                start = i; 
            }
        }
        
        // for len greater than 2. k is length of substring 
        for(int k=2; k<=n; k++){
            // fix the starting index
            for(int i=0; i<n-k+1; i++){
                // get the ending index of sustring from starting index i and 
                // length k
                int j = i+k-1;
                // checkng for the substring from the ith index to jth index iff 
                // str.charAt(i+1) to str.charAt(j-1) is pallindrome; 
        
                if(table[i+1][j-1] && s.charAt(i) == s.charAt(j)){
                    table[i][j] = true; 
                    if(k > maxLen){
                        start = i; 
                        maxLen = k;
                    }
                }
            }
        }
        return s.substring(start, start+maxLen); 
    }
    /*
    public static void main(String[] args){
        String s = "cbb"; 
        String ans = getLongestPallindrome(s); 
        System.out.println(ans);
    }
    */
}
