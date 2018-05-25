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
// buy and sell a stock w/ max profit
public class StocksBuySellI {
    public static int getMaxProfit(int[] prices){
        if(prices.length == 0)
            return 0; 
        int maxProfit = 0; 
        int curMin = prices[0];
        for(int i=1; i<prices.length; i++){
            curMin = Math.min(curMin, prices[i]); 
            maxProfit = Math.max(maxProfit, prices[i] - curMin); 
        }
        return maxProfit; 
    }
    /*
    public static void main(String[] args){
        //int[] prices = {3, 4, 2, 5, 9, 2,1}; 
        int[] prices = {7,6,4,3,1}; 
        int maxProfit = getMaxProfit(prices);
        System.out.println(maxProfit);
    }
    */
}
