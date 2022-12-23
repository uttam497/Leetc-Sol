class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalsum=n*(n+1)/2;
        for(int i : nums)
        {
            totalsum-=i;
        }
        return totalsum;
    }
}