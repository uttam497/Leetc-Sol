class Solution {
    public int minCostClimbingStairs(int[] cost) {
    if(cost.length==2)
    {
        return Math.min(cost[0],cost[1]);
    }
        int memo[]=new int[cost.length];
        for(int i=0;i<cost.length;i++)
        {
            memo[i]=-1;
        }
        int x=minCost(cost,0,memo);
        int y= minCost(cost,1,memo);
        return Math.min(x,y);
            
    }
    public int minCost(int cost[],int ind,int memo[])
    {
      if(ind==cost.length-1||ind==cost.length-2)
      {
          return cost[ind];
      }
        if(memo[ind]!=-1)
        {
            return memo[ind];
        }
        int a=minCost(cost,ind+1,memo);
        int b=minCost(cost,ind+2,memo);
        memo[ind]=cost[ind]+ Math.min(a,b);
        return memo[ind];
    }
}