/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author dichha
 */
public class PascalsTriangle {
    
    public static List<List> generate(int numRows){
        List<List> resultList = new ArrayList<List>(); 
        List list = new ArrayList(); 
        
        for(int i=0; i<numRows; i++){
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    list.add(1); 
                }else{
                    list.add((int)(resultList.get(i-1).get(j-1)) + (int)(resultList.get(i-1).get(j)));
                }
            }
            resultList.add(list); 
            list = new ArrayList(); 
        }
        return resultList; 
    }
    /*
    public static void main(String[] args){
        List<List> ans = generate(4); 
        System.out.println(ans);
    }
    */
}
