class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++)
        {
            int prod=1;
            for(int j=i;j<n;j++)
            {
                prod*=nums[j];
                if(prod<k)
                {
                    a++;
                }
                else{
                    break;
                }
            }
        }
        return a++;
    }
}