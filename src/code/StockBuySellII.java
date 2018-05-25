package code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dichha
 */
// can buy and sell more than 1 stock 
public class StockBuySellII {
    public static int getMaxSuccessiveProfit(int[] prices){
        if(prices.length == 0)
            return 0; 
        int maxProfit = 0; 
        int buyIndex = 0; 
        for(int i=1; i<prices.length; i++){
            if(prices[i] < prices[buyIndex])
                buyIndex = i; 
            if(prices[i] > prices[buyIndex]){
                maxProfit += (prices[i] - prices[buyIndex]); 
                buyIndex = i; 
            }
        }
        return maxProfit; 
    }
    
    /*
    public static void main(String[] args){
        int[] prices = {1, 3, 4, 1, 7, 9, 3}; 
        int maxSuccessiveProfit = getMaxSuccessiveProfit(prices); 
        System.out.println(maxSuccessiveProfit); 
    }
    */
    
}
