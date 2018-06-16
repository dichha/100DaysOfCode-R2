/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.util.List; 
import java.util.ArrayList; 
import java.util.Arrays; 
/**
 *
 * @author dichha
 */
public class BeautifulSubArray {
    public static int beautify(int[] arr, int k){
        if (arr == null || arr.length == 0)
            return 0; 
        
        List<List<Integer>> res = new ArrayList<List<Integer>>(); 
        int globalCnt = 0;
        for(int i=0; i< arr.length; i++){
            int localCnt = 0;
            List<Integer> list = new ArrayList<Integer>(); 
            List<Integer> auxList = null; 
            for(int j=i; j<arr.length; j++){
                if (auxList == null)
                    list.add(arr[j]); 
                else 
                    auxList.add(arr[j]);
                
                if(arr[j] %2 != 0)
                    localCnt += 1; 
                
                if(localCnt == k){
                    if(!res.contains(list) || (auxList != null)){
                        if(auxList != null){
                            res.add(auxList); 
                        }else{
                            res.add(list); 
                        }
                        globalCnt += 1;
                        //System.out.println("Hello"); 
                        System.out.println(list.toString());
                    }else {
                        localCnt = 0; 
                        auxList = new ArrayList<Integer>(); 
                        for(int l=0; l<list.size(); l++){
                            auxList.add(list.get(l)); 
                        } 
                        
                    }
                }
            }
        }
        
        
        return globalCnt; 
    }
    /*
    public static void main(String[] args){
        int[] arr = {2, 5, 4, 9}; 
        int ans = beautify(arr, 1); 
        System.out.println(ans); 
    }
    */
    
}
