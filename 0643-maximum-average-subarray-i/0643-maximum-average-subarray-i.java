class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int size=nums.length;
        int j=0;
        int i=0;
        int sum=0;
        double Max=Integer.MIN_VALUE;
        while(j<size)
        {
            sum=nums[j]+sum;
            if(j-i+1==k)
            {
                double avg=sum*1.0/k;
                if(Max<avg)
                {
                    Max=avg;
                }
                sum=sum-nums[i];
                i++;
                j++;
                
            }
            else if(j-i+1<k)
            {
                j++;
        }
        }
        return Max;
    }
}