class Solution {
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return minJump(nums,nums.length-1,dp);
    }
    public int minJump(int nums[],int ind,int dp[])
    {
        if(ind==0)  return 0;
        if(dp[ind]!=-1) return dp[ind];
        int op=Integer.MAX_VALUE;
        for(int i=0;i<ind;i++)
        {
            if(i+nums[i]>=ind)
            {
                op=Math.min(op,1+minJump(nums,i,dp));
            }
        }
        return dp[ind]=op;
    }
}

// class Solution {
// public:
//     int utils(vector<int>& nums, int ind, vector<int>& dp){
//         if(ind == 0)
//             return 0 ;
//         if(dp[ind] != -1) return dp[ind] ;
//         int op = INT_MAX ;
//         for(int i = 0 ; i < ind ; i++){
//             if(i + nums[i] >= ind){
//                 op = min(op, 1 + utils(nums, i, dp)) ;
//             }
//         }
//         return dp[ind] = op ;
//     }
    
//     int jump(vector<int>& nums) {
//         vector<int>dp(nums.size(), -1) ;
//         return utils(nums, nums.size()-1, dp) ;
//     }
// };