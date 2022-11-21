class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(!map.containsKey(i+1))list.add(i+1);
            
        }        
        return list;
    }
}