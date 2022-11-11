class Solution {
    public int minimumDifference(int[] nums, int k) {
        int size=nums.length;
        int minDiff=Integer.MAX_VALUE;
        if(size == 1) return 0;
        if(size== 2) return Math.abs(nums[0] - nums[1]);
        
        
        Arrays.sort(nums);
    
        int i=0;
        int j=0;
        
        while(j<size)
        {
            
            if(j-i+1==k)
            {
                
                int diff=Math.abs(nums[j]-nums[i]);
                if(minDiff>diff)
                {
                    minDiff=diff;
                }
                
                i++;
                j++;
            }
            else if(j-i+1<k)
            {
            j++;
            }
            else    i++;
        }
        
        return minDiff;
    }
}

// int n = nums.size();
//         if(n==1 or n==0){
//             return 0;
//         }
//         sort(nums.begin() , nums.end());
//         int minn = INT_MAX;
//         int i=0 , j=0;
//         while(j<n){
//             if((j-i+1)<k){
//                 j++;
//             }
//             else if((j-i+1)==k){
//                 int diff = abs(nums[j]-nums[i]);
//                 minn = min(minn , diff);
//                 i++;
//                 j++;
//             }
//             else{
//                 i++;
//             }
//         }
//         return minn;
//     }
// };