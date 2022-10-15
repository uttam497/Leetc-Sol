class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size=nums.length;


            int i = 0;
            int j = 0;
            int sum = 0;
            int minlength = Integer.MAX_VALUE;
            while (j < size)
            {

                sum += nums[j]; // updating our sum everytime 
                
                if (sum < target)
                {
                    j++;
                }
                if (sum >= target)
                {

                    while (sum >= target)
                    {
                        minlength = Math.min(minlength, j - i + 1);	// update out minlength whenever we hit the target
                        sum -= nums[i];
                        i++;
                    }
                    j++;
                }
            }

            return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
        }
}