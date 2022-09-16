class Solution {
    int N, M;
    public int maximumScore(int[] nums, int[] multipliers) {
        N = nums.length;
        M = multipliers.length;
	    return helper(nums, multipliers, 0, 0, new Integer[M][M]);
    }

    private int helper(int[] nums, int[] multipliers, int left, int index, Integer[][] dp) {
	    int right = N - 1 - (index - left);
	    if (index == M) return 0;

	    if (dp[left][index] != null) return dp[left][index];

	    int res = Math.max(
            nums[left] * multipliers[index] + helper(nums, multipliers, left+1, index+1, dp), 
            nums[right] * multipliers[index] + helper(nums, multipliers, left, index+1, dp));

        dp[left][index] = res;
	    return res;
    }
}



































//class Solution {
//     public int maximumScore(int[] nums, int[] multipliers) {
//         int n=nums.length;
//         int m=multipliers.length;
        
//         int prod=1;
//         int sum=0;
//         int s=-1;
//         for(int i=0;i<m;i++)
//         { 
//             int max=Integer.MIN_VALUE;
//             for(int j=0;j<n;j++)
//             {
//                 if(nums[j]!=Integer.MIN_VALUE){
//                 prod=multipliers[i]*nums[j];
//                 if(max<prod)
//                 {
//                     max=prod;
//                     s=j;
//                 }
//             }
//             }
//         nums[s]=Integer.MIN_VALUE;
//             sum=sum+max;
//         }
//         return sum;
//     }
// }