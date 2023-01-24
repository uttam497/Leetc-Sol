


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size=nums.length;
        int i=0,j=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(j<size)
        {
            sum=sum+nums[j];
            int p=i;
            

         if(sum>target)
            {

                    ans=Math.min(ans,j-i+1);
                while(i<j && sum>target)
                {
                    sum=sum-nums[i];
                    ans=Math.min(ans,j-i+1);
                    i++;
                }
                
            }
            if(sum==target)
            {
                    ans=Math.min(ans,j-i+1);
                        j++;
            }

           else if(sum<target)  j++;
            
        }
        if(ans==Integer.MAX_VALUE)  return 0;
        else    return ans;
    }
}