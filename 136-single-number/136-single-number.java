class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap < > ();
        for(int e : nums)
        {
            map.put(e,map.getOrDefault(e,0)+1);
        }
      for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return -1;
    }
}