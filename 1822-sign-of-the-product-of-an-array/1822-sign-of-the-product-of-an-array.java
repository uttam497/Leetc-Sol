class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        int p=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                p=1;
                break;
            }
            else if(nums[i]<0)
            {
                c++;
            }
        }
        if(p==1)    return 0;
        if(c%2==0)  return 1;
        else return -1;
        
    }
}