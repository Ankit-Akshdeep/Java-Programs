import java.util.*;
public class Stocks{
    
    public static int MaximumProfit(int prices[]){
       int maxprof = 0;
       int buyprice = Integer.MAX_VALUE;

       for(int i = 0; i<prices.length; i++){
        if(buyprice < prices[i]){
            int profit = prices[i] - buyprice; 
            maxprof = Math.max(maxprof, profit);
        } else{
            buyprice = prices[i];

        }
       }
       return maxprof;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println( MaximumProfit(prices));
    }
} //the time complexity of this program is O(n).