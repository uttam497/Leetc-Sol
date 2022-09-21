class Solution {
    HashMap<Integer,Integer> Map = new HashMap<>();
    
    public boolean isHappy(int n) 
    {
       
            return Happy(n);
            
    }
    public boolean Happy(int n)
    {
        if(n==1)
        {
            return true;
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
        
        return Happy(sum);
    }
    
}