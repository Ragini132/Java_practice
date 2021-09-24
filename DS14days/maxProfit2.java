class Solution {
    public int maxProfit(int[] prices) {
        
         int maxProfit = 0;
        
        // case 1: inc order
        int inc=0;
        int dec=0;
        for(int i=0;i<prices.length-1;i++){
            if(i!=prices.length-1){
            if(prices[i]<prices[i+1] && (i+1)!=prices.length){
                inc++;
            }
            else if (prices[i]>prices[i+1] && (i+1)!=prices.length){
                dec++;
            }
            }
        }
        
        if(inc==prices.length){
            return prices[(prices.length)-1]-prices[0];
        }
        if(dec==prices.length){
            return 0;
        }
        else{
        // The loop starts from 1
        // as its comparing with the previous
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i - 1]){
                maxProfit = Math.max(maxProfit,prices[i] - prices[i - 1]);
                                     }
                                     }
        return maxProfit;
        }
        
    }
}
