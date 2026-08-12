class Solution {
    public int maxProfit(int[] prices) {
        
        int lp = 0;
        int rp = 1;
        int max = 0;

        for(int i = 0; i < prices.length-1; i++){
            if(prices[lp] < prices[rp]){
               int profit = prices[rp] - prices[lp];
               max = Math.max(max, profit);
               
            }else{
                lp = rp;
            }
            rp++;
        }
        return max;
    }
}
