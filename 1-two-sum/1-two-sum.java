class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ar[]=new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(map.containsKey(diff))
            {
                ar[0]=map.get(diff);
                ar[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ar;
    }
}

