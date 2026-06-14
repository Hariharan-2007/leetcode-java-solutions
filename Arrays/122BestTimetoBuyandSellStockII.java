class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0],max=0;
        int maxProfit=0;
        int dif=0 ;
        int totalprofit=0;
        int profit=0;
        
        for(int i=1;i<prices.length;i++){
            
            if(min>prices[i]||max>prices[i]){
                profit+=totalprofit;
                totalprofit=0;
                maxProfit=0;
                min = prices[i];
                max= prices[i];
               
            }else{
                dif = prices[i]-min;
                maxProfit=Math.max(maxProfit,dif);
                totalprofit=maxProfit;
                max= prices[i];
            }
            
        }
        if(totalprofit!=0){
            profit+=maxProfit;
        }
        return profit;
    }
}