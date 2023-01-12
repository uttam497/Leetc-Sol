class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int size=s.length();
        int i=0;
        int j=0;int ans=0;
         while(i<size){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        
        if(map.size()==i-j+1)
        {
            ans=Math.max(ans,i-j+1);
        }
        else if(map.size()<i-j+1){
            while(j<i&&map.size()<(i-j+1))
            {
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0)
                {
                    map.remove(s.charAt(j));
                }
                j++;
            }
                
            
        }
       i++; 
    }
    return ans;
    
    
    
        
    }
}