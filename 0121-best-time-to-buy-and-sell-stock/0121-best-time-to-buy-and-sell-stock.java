class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int min=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            if((prices[i]-minprice)>min)
            {
                min=prices[i]-minprice;
            }
        }
        return min;
    }
}