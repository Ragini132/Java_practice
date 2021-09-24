class Solution {
    public int maxProfit(int[] prices) {
        
        HashMap<Integer, Integer> map1= new HashMap<Integer, Integer>();
        
        int diff=0;
        int maxdiff=0;
        int max2=0;
        
        // store the array and its sum in hashmap
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                diff=prices[j]-prices[i];
                if(maxdiff<=diff && maxdiff>=0){
                    maxdiff=diff;
                    map1.put(prices[i],maxdiff);
                }
                
            }
            if(max2<=maxdiff){
                    max2=maxdiff;
                }
        }
        
        return max2;
        
        
    }
}
