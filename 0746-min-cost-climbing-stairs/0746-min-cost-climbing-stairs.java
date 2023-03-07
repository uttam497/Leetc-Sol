class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            dp[i]=-1;
        }
     return Math.min(climb(0,cost,n,dp),climb(1,cost,n,dp));   
    }
    public int climb(int i,int cost[],int n,int dp[])
    {
        if(i==n-1 || i==n-2) return cost[i];
        if(dp[i]!=-1)   return dp[i];
           int a= cost[i]+climb(i+1,cost,n,dp);
        int b= cost[i]+climb(i+2,cost,n,dp);
        dp[i]=Math.min(a,b);
        return Math.min(a,b);
    }
}