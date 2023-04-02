class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=(low+high)/2;
       return  Binary(nums,target,low,high,mid);
    }
    public int Binary(int nums[],int target,int low,int high,int mid)
    {
        if(low>high)   return -1;
        if(nums[mid]==target)   return mid;
        else if(nums[mid]>target)    high=mid-1;
        else if(nums[mid]<target)    low=mid+1;
        mid=(low+high)/2;
        return Binary(nums,target,low,high,mid);
    }
}