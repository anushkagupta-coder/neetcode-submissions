class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minprice=prices[0];
        int profit=0;
        for(int i=1 ; i<prices.length ; i++){
            profit =prices[i]-minprice;
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
