class Solution {
    public int maxProfit(int[] prices) {
        // Code here
       int minimum = Integer.MAX_VALUE, maximum = 0 ;
       for(int i = 0; i < prices.length; i++){ 
           minimum= Math.min(minimum, prices[i]); 
           maximum= Math.max(maximum, prices[i]- minimum); 
           
       }
       return maximum; 
    }
}