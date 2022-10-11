class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]-nums[i]==diff)
                {
                    for(int k=n-1;k>j;k--)
                    {
                        if(nums[k]-nums[j]==diff)
                        {
                            s++;
                            break;
                        }
                    }
                }
            }
        }
        return s;
    }
}