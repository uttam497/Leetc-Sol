class Solution {
    public void sortColors(int[] nums) {
        int start=0,end=nums.length-1;
        int i=0;
        int temp=0;
        while(i<=end)
        {
            if(nums[i]==0)
            {
                temp=nums[start];
                nums[start]=nums[i];
                nums[i]=temp;
                start++;
                i++;
            }
            else if(nums[i]==2)
            {
                temp=nums[end];
                nums[end]=nums[i];
                nums[i]=temp;
                end--;
            }
            else i++;
        }
    }
}


