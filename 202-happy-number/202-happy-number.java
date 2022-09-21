class Solution {
    HashMap<Integer,Integer> Map = new HashMap<>();
    
    public boolean isHappy(int n) 
    {
        int k=0;
             Map.put(k,-1);
            return Happy(n,++k);
            
    }
    public boolean Happy(int n,int k)
    {
        if(n==1)
            {
                return true;
            }
        if(Map.containsValue(n))
        {
            return false;
        }
        
        Map.put(n,Map.getOrDefault(n, 0)+1);

            if(Map.get(n) > 1) return false;
        int sum=0;
            while(n!=0)
            {
                int rem=n%10;
                 sum=sum+rem*rem;
                n=n/10;
            }
        
        return Happy(sum,k++);
    }
    
}