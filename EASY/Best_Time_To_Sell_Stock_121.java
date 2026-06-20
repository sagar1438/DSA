class Solution {
    public int maxProfit(int[] prices) {
        int sol = 0;
        int stock = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(prices[i]<=stock){
                stock=prices[i];
            }else{
                int profit = prices[i] -stock;
                sol = Math.max(sol,profit);
            }
        }
        return sol;
    }
}