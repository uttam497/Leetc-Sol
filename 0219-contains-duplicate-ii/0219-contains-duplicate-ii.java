class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        int i=0;
        int j=0;
        int size=nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        while(j<size)
        {
            if(i==j)    map.put(nums[j],j);
            
            if(j!=i && j-i<k)
            {
                if(map.containsKey(nums[j]))
                   {
                       return true;
                   }
                  map.put(nums[j],j);
            }
                   else  if(j-i==k)
                   {
                       if(map.containsKey(nums[j]))
                       {
                           return true;
                       }
                       map.put(nums[j],j);
                       map.remove(nums[i]);
                       i++;
                       
                   }
            j++;
        }
        return false;

       
    }
}


 // Map<Integer, Integer> hashMap = new HashMap<>();
 //        for (int i = 0; i < nums.length; i++) {
 //            int integer = nums[i];
 //            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
 //                return true;
 //            hashMap.put(integer, i);
 //        }
 //        return false;