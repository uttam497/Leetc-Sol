class Solution {
    public int trap(int[] height) {
    int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int temp=height[0];
        left[0]=temp;
        right[n-1]=height[n-1];
        int max=height[n-1];
        for(int i=1;i<n;i++)
        {
            if(temp<height[i])
            {
                temp=height[i];
            }
            left[i]=temp;
            if(max<height[n-i-1])
            {
                max=height[n-i-1];
            }
            right[n-i-1]=max;
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
             ans=ans+((Math.min(left[i],right[i]))-height[i]);
        }
        return ans;
    }
}