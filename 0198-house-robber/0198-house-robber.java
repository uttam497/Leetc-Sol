class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=-1;
        }
        return robber(0,nums,n,dp);
    }
    public int robber(int i,int nums[],int n,int dp[])
    {
        if(i==n-1)    return nums[i];
        if(i>=n)    return 0;
        if(dp[i]!=-1)   return dp[i];
        int a=nums[i]+robber(i+2,nums,n,dp);
        int b=robber(i+1,nums,n,dp);
        dp[i]=Math.max(a,b);
        return Math.max(a,b);
    }
}

