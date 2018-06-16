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
public class EvalExp {
    public static int eval(String equat){
        if(equat == null || equat.length() == 0)
            return 0;
        int res = Character.getNumericValue(equat.charAt(0)); 
        for(int i=1; i<equat.length(); i+=2){
            char op = equat.charAt(i);
            int opd2 = 0; 
            try{
                opd2 = Character.getNumericValue(equat.charAt(i+1));
                System.out.println(opd2);
            }catch(Exception e){
                return -1; 
            }
            if(op == '+'){
                 res += opd2;  
                 System.out.println(res);
            }else if(op == '-'){
                res -= opd2; 
                System.out.println(res);
            }else if(op == '*'){
                res *= opd2; 
                System.out.println(res);
            }else if (op == '/'){
                res /= opd2;
                System.out.println(res);
            }else{
                return -1; 
            }
           
            
        }
        return res; 
    }
    /*
    public static void main(String[] args){
        String equation = "4-2+6*3"; 
        int ans = eval(equation); 
        System.out.println(ans);
    
    */
}
