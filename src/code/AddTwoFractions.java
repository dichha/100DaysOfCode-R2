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
public class AddTwoFractions {
    public static String addFraction(String a, String b){
        if(a == null && b == null)
            return null; 
        if(a == null)
            return reduce(b); 
        if(b == null)
            return reduce(a); 
        String a2 = reduce(a); 
        String b2 = reduce(b); 
        String[] aArr = a2.split("/"); 
        String[] bArr = b2.split("/"); 
        int deno1 = Integer.parseInt(aArr[1]); 
        int deno2 = Integer.parseInt(bArr[1]); 
        int lcm = getLCM(deno1, deno2); 
        
        
        int num = Integer.parseInt(aArr[0])*(lcm/deno1) + Integer.parseInt(bArr[0])*(lcm/deno2); 
       
        String reduced = Integer.toString(num) + "/" + Integer.toString(lcm); 
        return reduced; 
    }
    public static int getLCM(int a, int b){
        int mul = a >= b? a: b; 
        int idx = 1; 
        while(mul%a != 0 && mul%b != 0){
            mul *= idx++; 
        }
        return mul; 
        
    }
    public static String reduce(String s){
        String[] fract = s.split("/"); 
        return (getReducedFrac(fract)); 
    }
    public static String getReducedFrac(String[] fract){
        int num = Integer.parseInt(fract[0]); 
        int deno = Integer.parseInt(fract[1]); 
        int gcd = getGCD(num, deno); 
        //System.out.println(gcd); 
        int rnum = num/gcd; 
        int rdeno = deno/gcd; 
        return (Integer.toString(rnum) + "/" + Integer.toString(rdeno));
    }
    public static int getGCD(int n, int d){
        int range = 0; 
        int gcd = 1; 
        if(n > d)
            range = d; 
        else 
            range = n; 
        for(int i = 2; i<=range; i++){
            if(n%i == 0 && d%i == 0)
                gcd = i; 
        }
        return gcd; 
    }
    public static void main(String[] args){
        String a = "1/2"; 
        String b = "4/2"; 
        String a1 = "1/3";
        String b1 = "3/9"; 
        String a2 = "1/5"; 
        String b2 = "3/15"; 
        String ans = addFraction(a2, b2); 
        System.out.println(ans); 
    }
}
