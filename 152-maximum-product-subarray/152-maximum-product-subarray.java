class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int curr=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {   curr=1;
            for(int j=i;j<n;j++)
            {
                curr*=nums[j];
                res=Math.max(curr,res);
            }
        }
            return res;
        
    }
}







