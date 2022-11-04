class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
             hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet())
        
        {
            if(e.getValue()>=2)
                return (Integer)e.getKey();
        }
        
        return -1;
}
}