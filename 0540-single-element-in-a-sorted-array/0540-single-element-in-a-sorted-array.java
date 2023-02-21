class Solution {
    public int singleNonDuplicate(int[] nums) {
        int j=1;
        int c=0;
        int n=nums.length;
        if(n==1)    return nums[n-1];
                

        
            
        
        for(int i=0;i<nums.length;i=i+2)
        {
            if(j<n-1 && nums[i]!=nums[j])
            {
                c=nums[i];
                break;
            }
            if(j==n-2)
            {
                c=nums[n-1];
                break;
            }
            j=j+2;
        }
        return c;
    }
}